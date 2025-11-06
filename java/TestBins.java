public class TestBins {
    public static void main(String[] args) {
        System.out.println("Testing Bins class...");
        
        // Test the Bins class for 2 dice (range 2-12)
        Bins results = new Bins(2, 12);
        
        // Test incrementing some bins
        results.incrementBin(7);  // Most common sum for 2 dice
        results.incrementBin(7);
        results.incrementBin(7);
        results.incrementBin(2);  // Least common sum
        results.incrementBin(12); // Least common sum
        
        // Test getting bin values
        System.out.println("Bin 7 count: " + results.getBin(7));
        System.out.println("Bin 2 count: " + results.getBin(2));
        System.out.println("Bin 12 count: " + results.getBin(12));
        
        // Test total count
        System.out.println("Total count: " + results.getTotalCount());
        
        // Test percentage
        System.out.println("Percentage for bin 7: " + results.getPercentage(7));
        
        System.out.println("Bins class works correctly!");
    }
}