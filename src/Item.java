public class Item {
    private final String manufacturer;
    private final String hdd;
    private final String os;
    private final int id;
    private final int capacityHDD;
    private final int capacityRAM;

    public Item(int id, String manufacturer, String os, String hdd, int capacityHDD, int capacityRAM) {
        this.manufacturer = manufacturer;
        this.hdd = hdd;
        this.os = os;
        this.id = id;
        this.capacityHDD = capacityHDD;
        this.capacityRAM = capacityRAM;
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
