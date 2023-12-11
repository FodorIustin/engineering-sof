package eShop;

import java.util.ArrayList;
import java.util.List;

public class Seller {

	private String name;
    private List<Product> products = new ArrayList<>();
    private List<Promotion> promotions = new ArrayList<>();

    public Seller(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(name + " added " + product.getName() + " to the product list.");
    }

    public void addPromotion(Promotion promotion) {
        promotions.add(promotion);
        System.out.println(name + " added a promotion: " + promotion);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Promotion> getPromotions() {
        return new ArrayList<>(promotions);
    }
}
