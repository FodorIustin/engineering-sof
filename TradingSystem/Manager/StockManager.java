public class StockManager {
    private static StockManager instance;
    private List<Stock> availableStocks;

    private StockManager() {
        availableStocks = new ArrayList<>();
        // Initialize stocks here
    }

    public static StockManager getInstance() {
        if (instance == null) {
            instance = new StockManager();
        }
        return instance;
    }
  // method to add stock
    public List<Stock> getAvailableStocks() {
        return availableStocks;
    }

   
}
