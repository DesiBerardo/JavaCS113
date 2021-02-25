public class DieTest
{
    public static int dieStats(Die die1, Die die2)
    {
        int count = 0;
        while (count < 10)
        {
            die1.roll();
            System.out.println(die1 + " " + die2);
            if (die1.compareTo(die2) == 1)
                return count + 1;
            count++;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die(4);


        System.out.println(dieStats(die3, die4));

        System.out.println("Intitial values: " + die1.getFaceValue() + " " + die2.getFaceValue());

        System.out.println("------------------------------------------------");
        int count = 0;
        while (!die1.equals(die2))
        {
            die1.roll();
            die2.roll();
            System.out.println(die1.getFaceValue() + " " + die2.getFaceValue());
            count++;
        }
        System.out.println("It took " + count + " times to roll");
    }
}
