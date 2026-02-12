public class Order {
    public String productName;
    public int quantity;
    public double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}