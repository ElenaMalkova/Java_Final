import java.util.ArrayList;
import java.util.List;

public class NotebooksList {
    private final List<Item> notebooks = new ArrayList<>();
    public NotebooksList() {
    }
    public List<Item> FilledList() {
        notebooks.add(new Item(1, "HP", "Win 10", "SSD", 250, 8));
        notebooks.add(new Item(2, "HP", "Win 10", "SSD", 250, 8));
        notebooks.add(new Item(3, "HP", "Win 10", "SSD", 500, 16));
        notebooks.add(new Item(4, "HP", "None", "HDD", 1000, 8));
        notebooks.add(new Item(5, "Lenovo", "Linux", "SSD", 750, 32));
        notebooks.add(new Item(6, "Acer", "Win 8", "SSD", 250, 8));
        notebooks.add(new Item(7, "Apple", "Mac OS X", "SSD", 500, 64));
        notebooks.add(new Item(8, "Dell", "Win 10", "SSD", 1000, 16));
        notebooks.add(new Item(9, "Dell", "Win 10", "SSD", 500, 8));
        notebooks.add(new Item(10, "Acer", "Win 8", "SSD", 250, 32));
        return notebooks;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : FilledList()) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}
