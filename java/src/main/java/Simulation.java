public class Simulation {
    
    private int numberOfDice;
    private int numberOfTosses;
    private Dice dice;
    private Bins bins;
    
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        
        int minSum = numberOfDice;
        int maxSum = numberOfDice * 6;
        this.bins = new Bins(minSum, maxSum);
    }
    
    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            int sum = dice.tossAndSum();
            bins.incrementBin(sum);
        }
    }
    
    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***");
        System.out.println();
        
        for (int i = bins.getMinValue(); i <= bins.getMaxValue(); i++) {
            int count = bins.getBin(i);
            double percentage = bins.getPercentage(i);
            String stars = getStars(percentage);
            
            System.out.printf("%2d : %8d: %.2f %s%n", i, count, percentage, stars);
        }
    }
    
    private String getStars(double percentage) {
        int numStars = (int) Math.round(percentage * 100);
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < numStars; i++) {
            stars.append("*");
        }
        return stars.toString();
    }
    
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }
}
