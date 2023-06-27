// Класс Item содержит поля для описания ноутбука
// Класс NotebooksList — отдельно вынесено заполнение полей экземпляров объектов
// Класс NoteFilter — там всё и происходит. Меню и выдача списков в зависимости от выбора.
// Не удалось сделать красивый вывод списка без скобок и запятых.
public class Main {
    public static void main(String[] args) {
        NoteFilter nf = new NoteFilter();
        System.out.println(nf.SecondaryMenuInput());
    }
}