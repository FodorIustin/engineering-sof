public class SellStockCommand implements StockCommand {
    private User user;
    private Stock stock;
    private int quantity;

    public SellStockCommand(User user, Stock stock, int quantity) {
        this.user = user;
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        // Implementation for selling stock
    }
}