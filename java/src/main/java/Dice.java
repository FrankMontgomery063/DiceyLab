public class Dice {

    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += roll();
        }
        return sum;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    @Override
    public String toString() {
        return "Dice with " + numberOfDice + " dice";
    }
}

