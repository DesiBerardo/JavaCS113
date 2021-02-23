import java.util.Scanner;

public class BandBoosterDriver
{
    public static void promptUser(BandBooster band1, BandBooster band2, Scanner in)
    {
        System.out.println("How many boxes did " + band1.getName() + " sell this week?: ");
        band1.updateSales(in.nextInt());
        System.out.println("How many boxes did " + band2.getName() + " sell this week?: ");
        band2.updateSales(in.nextInt());
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of first band boster: ");
        BandBooster band1 = new BandBooster(in.nextLine());
        System.out.println("Enter name of second band boster: ");
        BandBooster band2 = new BandBooster(in.nextLine());

        for (int i = 0; i < 3; i++)
            promptUser(band1, band2, in);

        System.out.println(band1);
        System.out.println(band2);
    }
}