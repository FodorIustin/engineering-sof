package eShop;

public class EShop {
	
	 public static void main(String[] args) {
	        Product laptop = new Product("Laptop", "Electronics", 10, 1200.0);
	        Product smartphone = new Product("Smartphone", "Electronics", 20, 800.0);

	        Seller electronicsSeller = new Seller("Electronics Store");
	        electronicsSeller.addProduct(laptop);
	        electronicsSeller.addProduct(smartphone);

	        Client client = new Client("Fodor Iustin");

	        // adauga produs
	        client.getCart().addItem(laptop);

	        // adauga la favorite
	        client.addToFavorites(smartphone);

	        // Output 
	        System.out.println("Client's Favorites: " + client.getFavorites());
	        System.out.println("Seller's Products: " + electronicsSeller.getProducts());
	        System.out.println("Seller's Promotions: " + electronicsSeller.getPromotions());
	    }
}
