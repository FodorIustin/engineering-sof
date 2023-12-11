package eShop;

public class LoanPayment implements PaymentStrategy {
	
	 @Override
	    public void pay(double amount) {
	        System.out.println("Paid $" + amount + " with a loan.");
	    }
}
		//metoda de plata imprumut cu valoare ca parametru
