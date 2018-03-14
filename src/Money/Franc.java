package Money;

public class Franc {
    int amount = 10;

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
