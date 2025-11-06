public class Bins {
    
    private int[] bins;
    private int minValue;
    private int maxValue;
    
    public Bins(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.bins = new int[maxValue - minValue + 1];
    }
    
    public int getBin(int binNumber) {
        if (binNumber < minValue || binNumber > maxValue) {
            throw new IllegalArgumentException("Bin number " + binNumber + " is out of range [" + minValue + ", " + maxValue + "]");
        }
        return bins[binNumber - minValue];
    }
    
    public void incrementBin(int binNumber) {
        if (binNumber < minValue || binNumber > maxValue) {
            throw new IllegalArgumentException("Bin number " + binNumber + " is out of range [" + minValue + ", " + maxValue + "]");
        }
        bins[binNumber - minValue]++;
    }
    
    public int getMinValue() {
        return minValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }
    
    public int getTotalCount() {
        int total = 0;
        for (int count : bins) {
            total += count;
        }
        return total;
    }
    
    public double getPercentage(int binNumber) {
        int totalCount = getTotalCount();
        if (totalCount == 0) {
            return 0.0;
        }
        return (double) getBin(binNumber) / totalCount;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = minValue; i <= maxValue; i++) {
            sb.append("Bin ").append(i).append(": ").append(getBin(i)).append("\n");
        }
        return sb.toString();
    }
}
