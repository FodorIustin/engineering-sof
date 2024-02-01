public class CommandInvoker {
    private StockCommand command;

    public void setCommand(StockCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}