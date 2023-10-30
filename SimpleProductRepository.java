class SimpleProductRepository implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.getName());
    }

    @Override
    public Product read(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Read product: " + product.getName());
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.set(i, updatedProduct);
                System.out.println("Updated product: " + updatedProduct.getName());
                return;
            }
        }
    }
    @Override
    public void delete(int id) {
        Product removedProduct = null;
        for (Product product : products) {
            if (product.getId() == id) {
                removedProduct = product;
                break;
            }
        }
        if (removedProduct != null) {
            products.remove(removedProduct);
            System.out.println("Deleted product: " + removedProduct.getName());
        }
    }
}
