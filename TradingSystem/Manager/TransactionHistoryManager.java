public class TransactionHistoryManager {
    private static TransactionHistoryManager instance;
    private List<Transaction> transactionHistory;

    private TransactionHistoryManager() {
        transactionHistory = new ArrayList<>();
    }

    public static TransactionHistoryManager getInstance() {
        if (instance == null) {
            instance = new TransactionHistoryManager();
        }
        return instance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }

    
}
