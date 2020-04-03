package TDDev;

class Franc extends Money {
	private String currency;
	
	static Money franc (int amount) {
		return new Money(amount, "CHF");
	}
	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	Franc (int amount) { //Franc constructor
		super(amount);
	}
	
	Money times(int multiplier) { //Method multiplier for Franc; with return type Franc 
		return new Money (amount * multiplier, currency); //Why can't I put Money where Franc is?
	}
	
	String currency() {
		return "CHF";
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
