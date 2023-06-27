import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteFilter {

    //    Отдельно метод для ввода с клавиатуры.
    private String Input(String str) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(str);
        if (iScanner.hasNextLine()) {
            return iScanner.nextLine();
        }
        iScanner.close();
        return "ERR";

    }

    //Метод для выбора фильтра
    private int MainMenuInput() {
        String menu = """
                По какому критерию вы хотите отображать ноутбуки?
                Введите цифру, соответствующую Вашему выбору:
                1 — ID товара
                2 — Производитель
                3 — Операционная система
                4 — Тип накопителя
                5 — Объем накопителя
                6 — Объем RAM
                0 — Показать всё
                Введите число:\s""";

        return Integer.parseInt(Input(menu));
    }

    NotebooksList n = new NotebooksList();
    List<Item> notebooks = n.FilledList();
    List<Item> result = new ArrayList<>();

    //    Метод формирования результирующих списков в зависимости от выбора раньше.
    List<Item> SecondaryMenuInput() {
        switch (MainMenuInput()) {
            case 1 -> result = getByID();
            case 2 -> result = getByManufacturer();
            case 3 -> result = getByOS();
            case 4 -> result = getByHDDType();
            case 5 -> result = getByHDDCapacity();
            case 6 -> result = getByRAMCapacity();
            case 0 -> result = notebooks;
        }
        return result;
    }


    List<Item> getByID() {
        String line = "Введите номер ID ноутбука: ";
        String input = Input(line);
        for (Item item : notebooks) {
            if (item.getId() == Integer.parseInt(input))
                result.add(item);
        }
        return result;
    }

    List<Item> getByManufacturer() {
        String line = "Введите производителя ноутбука: ";
        String input = Input(line);
        for (Item item : notebooks) {
            if (item.getManufacturer().equals(input))
                result.add(item);
        }
        return result;
    }

    List<Item> getByOS() {
        String os = "";
        String line = """
                Выберите тип операционной системы ноутбука:
                1 — Windows 10
                2 — Apple
                3 — Linux
                4 — Windows 8
                Введите номер пункта:\s""";
        int input = Integer.parseInt(Input(line));
        switch (input) {
            case 1 -> os = "Win 10";
            case 2 -> os = "Mac OS X";
            case 3 -> os = "Linux";
            case 4 -> os = "Win 8";
        }
        for (Item item : notebooks) {
            if (item.getOs().equals(os))
                result.add(item);
        }
        return result;
    }

    List<Item> getByHDDType() {
        String type = "";
        String line = """
                Выберите тип диска ноутбука:
                1 — SSD
                2 — HDD
                Введите номер пункта:\s""";
        int input = Integer.parseInt(Input(line));
        switch (input) {
            case 1 -> type = "SSD";
            case 2 -> type = "HDD";
        }
        for (Item item : notebooks) {
            if (item.getHdd().equals(type))
                result.add(item);
        }
        return result;
    }

    List<Item> getByHDDCapacity() {
        String line = "Введите объем HDD: ";
        int input = Integer.parseInt(Input(line));
        for (Item item : notebooks) {
            if (item.getCapacityHDD() == input)
                result.add(item);
        }
        return result;
    }

    List<Item> getByRAMCapacity() {
        String line = "Введите объем RAM: ";
        int input = Integer.parseInt(Input(line));
        for (Item item : notebooks) {
            if (item.getCapacityRAM() == input)
                result.add(item);
        }
        return result;
    }
}
