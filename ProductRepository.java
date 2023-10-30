interface ProductRepository {
    void add(Product product);
    Product read(int id);
    void update(int id, Product updatedProduct);
    void delete(int id);
}