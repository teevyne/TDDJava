package TDDev;

class Money implements Expression {
	protected int amount;
	protected String currency;
	
	//abstract String currency();
	Money times(int multiplier) {
		return new Money (amount * multiplier, currency);
	} //No method body
	
	Money(int amount) {
		return;
	}
	
	public Money (int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency()); //koyemi o
	}
	
	static Money dollar (int amount) {
		return new Dollar(amount);
	} //This method creates and returns a Dollar 
	
	static Money franc (int amount) {
		return new Franc(amount);
	} //This method creates and returns a Dollar
	
	static Money Franc (int amount) {
		return new Franc(amount, "CHF");
	} //This method creates and returns a Franc
	
	static Money Dollar (int amount) {
		return new Dollar(amount, "USD");
	} //This method creates and returns a Dollar
	
	public String toString() {
		return amount + " " + currency;
	}
	
	Expression plus(Money addend) {
		//return new Money (amount + addend.amount, currency);
		return new Sum(this, addend);
	}
	
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		//int rate = (currency.equals("CHF") && to.equals("USD"))? 2 : 1;
		return new Money(amount / rate, to);// What is this 'to'?
	}
}