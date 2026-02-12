public class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        return order.quantity * order.price * 0.9;
    }
}