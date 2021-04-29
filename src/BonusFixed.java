import java.util.Scanner;

public class BonusFixed
{
    public static void main(String[] args) throws BonusTooLowException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of executives: ");
        int execs = in.nextInt();
        double totalRate = 0;
        Executive[] executive = new Executive[execs];
        BonusTooLowException exception = new BonusTooLowException("Bonus was too low, terminating program.");

        for (int i = 0; i < executive.length; i++)
        {
            System.out.println("Please enter name: ");
            String name = in.next();
            System.out.println("Please enter address: ");
            String address = in.next();
            System.out.println("Please enter phone: ");
            String phone = in.next();
            System.out.println("Please enter social security number: ");
            String socSecNumber = in.next();
            System.out.println("Please enter payrate: ");
            double rate = in.nextDouble();

            executive[i] = new Executive(name, address, phone, socSecNumber, rate);
            try
            {
                System.out.println("Please enter bonus: ");
                int bonus = in.nextInt();
                if (bonus < 1000) throw exception;
                executive[i].awardBonus(bonus);
                System.out.println("test");
            }
            catch (BonusTooLowException e)
            {
                System.out.println("Bonus too low, setting bonus to 0...");
                executive[i].awardBonus(0);
            }
        }
        for (int j = 0; j < executive.length; j++)
        {
            if(executive[j].getBonus() != 0)
                System.out.println(executive[j]);
            totalRate += executive[j].pay();
        }
        System.out.println("Average pay: " + totalRate / execs);
    }
}
