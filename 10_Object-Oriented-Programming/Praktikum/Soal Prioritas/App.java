package Product;

public class App {
    public static void main(String[] args) {
        Product coffee = new Product("coffee", "this is coffee", 15000, 10);
        Product milk = new Product("milk", "this is fresh milk", 25000, 10);
        Product juice = new Product("apple juice", "this is juice", 18000, 20);

        coffee.getInfo();
        milk.getInfo();
        juice.getInfo();
    }
}
