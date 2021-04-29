import java.util.Scanner;

public class Bonus
{
    public static void main(String[] args) throws BonusTooLowException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of executives: ");
        Executive[] executive = new Executive[in.nextInt()];
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
            System.out.println("Please enter bonus: ");
            int bonus = in.nextInt();
            if (bonus < 1000) throw exception;
            executive[i].awardBonus(bonus);
        }
        for (int j = 0; j < executive.length - 1; j++)
            System.out.println(executive[j]);
    }
}
