package Money;

public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }
    
    public boolean equals(Object object) {
        Franc franc = (Franc)object;
        return this.amount == franc.amount;
    }
}
