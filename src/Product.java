import Unit.Unit;

public class Product {
    private String name;
    private double price;
    private Unit unit;

    public Product(String name, double price, Unit unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return  name + '(' + price + " " + unit + ')';
    }
}
