public class OnlineShopMain {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 899.99);
        Product phone = new Product("Phone", 699.00);
        Product headphones = new Product("Headphones", 149.99);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(laptop);
        cart.addItem(phone);
        cart.addItem(headphones);

        System.out.println("Total Cost in the shopping cart: $" + cart.getTotalCost());

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(cart);
    }
}
