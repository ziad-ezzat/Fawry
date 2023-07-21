import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Product item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public List<Product> getItems() {
        return items;
    }
}
