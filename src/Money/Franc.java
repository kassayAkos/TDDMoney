package Money;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }
}
