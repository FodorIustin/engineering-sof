package eShop;

public class CashPayment implements PaymentStrategy{

	 @Override
	    public void pay(double amount) {
	        System.out.println("Paid $" + amount + " in cash.");
	    }
	}
		//metoda de plata cash cu valoare ca parametru
