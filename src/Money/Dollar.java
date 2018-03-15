package Money;

public class Dollar {
    private int amount = 10;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplayer) {
        return new Dollar(amount * multiplayer);
    }
    
    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return this.amount == dollar.amount;
    }
}
