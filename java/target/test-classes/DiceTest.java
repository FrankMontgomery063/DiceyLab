public class DiceTest {
    
    public static void main(String[] args) {
        System.out.println("Testing Dice class...\n");
        
        // Test 1: Create dice for craps (2 dice)
        Dice crapsDice = new Dice(2);
        System.out.println("Created: " + crapsDice);
        
        // Test multiple tosses
        System.out.println("Rolling 2 dice 10 times:");
        for (int i = 0; i < 10; i++) {
            int result = crapsDice.tossAndSum();
            System.out.println("Toss " + (i + 1) + ": " + result);
        }
        
        System.out.println();
        
        // Test 2: Create dice for Yahtzee (5 dice)
        Dice yahtzeeDice = new Dice(5);
        System.out.println("Created: " + yahtzeeDice);
        
        // Test multiple tosses
        System.out.println("Rolling 5 dice 5 times:");
        for (int i = 0; i < 5; i++) {
            int result = yahtzeeDice.tossAndSum();
            System.out.println("Toss " + (i + 1) + ": " + result);
        }
        
        // Test 3: Verify ranges
        System.out.println("\nTesting ranges (100 tosses each):");
        
        // 2 dice should give results between 2-12
        Dice twoDice = new Dice(2);
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < 100; i++) {
            int result = twoDice.tossAndSum();
            min2 = Math.min(min2, result);
            max2 = Math.max(max2, result);
        }
        System.out.println("2 dice range: " + min2 + " to " + max2 + " (expected: 2 to 12)");
        
        // 5 dice should give results between 5-30
        Dice fiveDice = new Dice(5);
        int min5 = Integer.MAX_VALUE;
        int max5 = Integer.MIN_VALUE;
        
        for (int i = 0; i < 100; i++) {
            int result = fiveDice.tossAndSum();
            min5 = Math.min(min5, result);
            max5 = Math.max(max5, result);
        }
        System.out.println("5 dice range: " + min5 + " to " + max5 + " (expected: 5 to 30)");
        
        System.out.println("\nDice class testing complete!");
    }
}