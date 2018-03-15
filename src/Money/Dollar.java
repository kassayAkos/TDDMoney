package Money;

<<<<<<< HEAD
public class Dollar extends Money {
=======
public class Dollar {

    private int amount;
>>>>>>> chapter_5

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
<<<<<<< HEAD
=======

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
>>>>>>> chapter_5
}
