package Money;

class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.currency = currency;
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && currency().equals(money.currency());
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }
}
