import java.util.Random;

public class CoinFlipSimulation {
    public static void main(String[] args) {
        int numExperiments = 10000; // Number of experiments to run
        int totalTosses = 0;

        for (int i = 0; i < numExperiments; i++) {
            int tosses = findConsecutiveTosses();
            totalTosses += tosses;
        }

        double averageTosses = (double) totalTosses / numExperiments;
        System.out.println("Average number of tosses to get 3 consecutive heads: " + averageTosses);
    }

    public static int findConsecutiveTosses() {
        Random random = new Random();
        int consecutiveHeads = 0;
        int totalTosses = 0;

        while (consecutiveHeads < 3) {
            int result = random.nextInt(2); // 0 for tails, 1 for heads
            totalTosses++;

            if (result == 1) {
                consecutiveHeads++;
            } else {
                consecutiveHeads = 0; // Reset if not heads
            }
        }

        return totalTosses;
    }
}