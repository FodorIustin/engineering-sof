public class LongTermInvestingStrategyFactory implements TradingStrategyFactory {
    @Override
    public TradingStrategy createTradingStrategy() {
        return new LongTermInvestingStrategy();
    }
}