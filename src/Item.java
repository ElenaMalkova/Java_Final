public class Item {
    private String manufacturer;
    private String hdd;
    private String os;
    private int id;
    private int capacityHDD;
    private int capacityRAM;

    public Item(int id, String manufacturer, String os, String hdd, int capacityHDD, int capacityRAM) {
        this.manufacturer = manufacturer;
        this.hdd = hdd;
        this.os = os;
        this.id = id;
        this.capacityHDD = capacityHDD;
        this.capacityRAM = capacityRAM;
    }

    public Item() {

    }
    @Override
    public String toString() {
        return String.format("\nID: %d\nПроизводитель: %s\nOS: %s\nТип HDD: %s\nОбъем HDD: %dGB\nОбъем RAM: %dGB\n", id, manufacturer, os, hdd, capacityHDD, capacityRAM);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public int getId() {
        return id;
    }

    public int getCapacityHDD() {
        return capacityHDD;
    }

    public int getCapacityRAM() {
        return capacityRAM;
    }
}
