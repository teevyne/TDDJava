package TDDev;

public class Dollar extends Money {
	
	static Money dollar (int amount) {
		return new Money(amount, "USD");
	}
	
	public Dollar(int amount) {
		super(amount);
	}
	
	private String currency;
	
	public Dollar(int amount, String currency) {
		super(amount, currency);
	}
		
	Money times(int multiplier) { 
		return new Money (amount * multiplier, currency); //Why can't I put Money where Dollar is? 
	}
	
	String currency() {
		return "USD";
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}