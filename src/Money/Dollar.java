package Money;

public class Dollar {

    int amount = 10;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return this.amount == dollar.amount;
    }
}
