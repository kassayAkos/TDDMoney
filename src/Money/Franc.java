package Money;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }
}
