public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new SimpleProductRepository();
        productRepository = new LoggingProductRepository(productRepository);

        Product product1 = new Product(1, "Product A");
        Product product2 = new Product(2, "Product B");

        productRepository.add(product1);
        productRepository.read(1);
        productRepository.update(1, new Product(1, "Updated Product A"));
        productRepository.delete(2);
    }
}