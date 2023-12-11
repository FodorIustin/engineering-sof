package eShop;

import java.util.ArrayList;
import java.util.List;

public class Client {

	  private String name;
	    private Cart cart;
	    private List<Product> favorites = new ArrayList<>();

	    public Client(String name) {
	        this.name = name;
	        this.cart = new Cart();
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}
		public void addToFavorites(Product product) {
	        favorites.add(product);
	        System.out.println(name + " added " + product.getName() + " to favorites.");
	    }
		public List<Product> getFavorites() {
	        return new ArrayList<>(favorites);
	    }
}
		// pe langa getters setters is constructor optiunea de add favorites
