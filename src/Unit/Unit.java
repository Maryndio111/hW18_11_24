package Unit;

public enum Unit {
    PIECE("шт"),
    KG  ("кг"),
LITERS("литры"),
PACK("упаковки");
    private String label;
    Unit(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
