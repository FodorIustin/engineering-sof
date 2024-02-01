- Factory
 the TradingStrategyFactory interface, DayTradingStrategyFactory, and LongTermInvestingStrategyFactory classes represent the Factory Method Pattern. This pattern is used to define an interface for creating an object, but let subclasses alter the type of objects that will be created.
 I used factory for creating instances of classes, more specific, of trading strategies

 - Strategy
 The Strategy Pattern is represented by the TradingStrategy interface and its implementations (DayTradingStrategy and LongTermInvestingStrategy). For defining interchangeable algorithms for executing trades

 - Singleton
 for having a point of control fro where to coordinate and give direction
  - it ensures that there is only one instance of StockManager in the entire application.
  - the first time getInstance() is called, it creates an instance of StockManager and assigns it to the instance variable.
  - subsequent calls to getInstance() return the existing instance without creating a new one. 

  - Command
  managing the execution of commands in a decoupled manner. 
  also encapsulating the details of a request (stock operation) into a separate object (StockCommand). This object contains all the necessary information to perform the operation.
  Flexibility and Extensibility:

  providing a flexible and extensible way to add new stock-related operations. You can introduce new command classes without modifying the invoker or other existing classes.
  
  lastly, the pattern decouples the sender of the request (client) from the object that processes the request (command). The client is not concerned with the details of how the command is executed.

