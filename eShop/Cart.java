package eShop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public void completeOrder() {
        for (Product item : items) {
            item.updateStock(1);
        }
        items.clear();
    }

    // Other cart-related methods...

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }
}

