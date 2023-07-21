public class OrderProcessor {
    public void placeOrder(ShoppingCart cart) {
        System.out.println("Order Details:");
        for (Product item : cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Cost: $" + cart.getTotalCost());
    }
}
