public class Runs
{
    public static void main (String[] args)
    {
        final int FLIPS = 10; // number of coin flips
        int currentRun =0; // length of the current run of HEADS
        int maxRun =0; // length of the maximum run so far
        Coin coin = new Coin();
        int count = 0;
        int countMax = 0;
// Create a coin object
// Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            coin.flip();
            System.out.println(coin);
            if (coin.isHeads())
            {
                count++;
                if (count > countMax)
                    countMax = count;
            }
            else
                count = 0;
// Flip the coin & print the result
// Update the run information
        }
        System.out.println("The longest run of heads was: " + countMax);
// Print the results
    }
}