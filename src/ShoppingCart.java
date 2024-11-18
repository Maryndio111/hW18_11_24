import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    public class ScoppingCart{
        private Map<Product, Integer> cart = new HashMap<>(); //korsina s tovarami
        private Map<Product, Integer> stock = new HashMap<>(); //sklad s kollichestvom tovara

        public void addProductToStock(Product product, int quantity) {
            stock.put(product, quantity);
        }
        public String addProductToCart(Product product, int quantity) {

            if (!stock.containsKey(product)) {
                return "Товар отсутствует на складе!";
            }
            int availableStock = stock.get(product);
            if (availableStock < quantity){
                return "Недостаточно товара на складе!";
            }
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            stock.put(product, availableStock - quantity);
            return "Товар добавлен в корзину!";
        }

        //soderzimoe korsini
        public void displayCart(){
            if (cart.isEmpty()) {
                System.out.println("Корзина пуста.");

            }else {
                cart.forEach((product, quantity) -> {
                    System.out.println(product.getName()+"-" + quantity + " " +product.getUnit().getLabel());

                });
            }
        }

        //vsego deneg nuzno sa tovari
        public double getTotalPrice(){
            return  cart.entrySet().stream()
                    .mapToDouble(entry ->entry.getKey().getPrice()*entry.getValue())
                    .sum();
        }
    }
}
