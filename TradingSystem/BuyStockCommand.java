public class BuyStockCommand implements StockCommand {
    private User user;
    private Stock stock;
    private int quantity;

    public BuyStockCommand(User user, Stock stock, int quantity) {
        this.user = user;
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        // Implementation for buying stock
    }
}