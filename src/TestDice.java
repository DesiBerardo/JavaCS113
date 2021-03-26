public class TestDice
{
    public static void main(String[] args)
    {
         Die[] dice = new Die[50];
         int count = 0;

         for (Die die : dice)
         {
             die = new Die();
             die.roll();

             if (die.getFaceValue() % 2 == 0)
             {
                 count++;
                 System.out.print("Even roll! it was: ");
             }
             System.out.println(die.getFaceValue());
         }
         System.out.println("Total number of die that were even: " + count);
    }
}