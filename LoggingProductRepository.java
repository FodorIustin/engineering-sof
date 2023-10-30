 public class LoggingProductRepository implements ProductRepository {
    private ProductRepository repository;

    public LoggingProductRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Product product) {
        System.out.println("Logging: Before adding");
        repository.add(product);
        System.out.println("Logging: After adding");
    }

    @Override
    public Product read(int id) {
        System.out.println("Logging: Before reading");
        Product result = repository.read(id);
        System.out.println("Logging: After reading");
        return result;
    }

    @Override
    public void update(int id, Product updatedProduct) {
        System.out.println("Logging: Before updating");
        repository.update(id, updatedProduct);
        System.out.println("Logging: After updating");
    }

    @Override
    public void delete(int id) {
        System.out.println("Logging: Before deleting");
        repository.delete(id);
        System.out.println("Logging: After deleting");
    }
}