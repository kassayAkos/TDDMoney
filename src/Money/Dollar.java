package Money;

public class Dollar {
    int amount = 10;

    Dollar(int amount) {
        this.amount = amount;
    }
    
    void times(int multiplayer) {
        amount *= multiplayer; 
    }
}
