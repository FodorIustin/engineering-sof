package eShop;

public class CardPayment implements PaymentStrategy {
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with a card.");
    }
	//metoda de plata cu cardul cu valoare ca parametru
}
