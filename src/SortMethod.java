import java.util.Comparator;

public enum SortMethod {
    NAME(Comparator.comparing(Product::getName)),
    PRICE(Comparator.comparingDouble(Product::getPrice)),
    UNIT(Comparator.comparing(product -> product.getUnit().getLabel()));

    private final Comparator<Product> comparator;
    SortMethod(Comparator<Product> comparator){
        this.comparator = comparator;
    }

    public Comparator<Product> getComparator() {
        return comparator;
    }
}
