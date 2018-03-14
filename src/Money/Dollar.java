package Money;

public class Dollar {
    int amount = 10;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplayer) {
        return new Dollar(amount * multiplayer);
    }
}
