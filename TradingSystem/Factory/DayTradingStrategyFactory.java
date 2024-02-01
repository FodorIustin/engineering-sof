public class DayTradingStrategyFactory implements TradingStrategyFactory {
    @Override
    public TradingStrategy createTradingStrategy() {
        return new DayTradingStrategy();
    }
}