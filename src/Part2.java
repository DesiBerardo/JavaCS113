import java.util.Scanner;

public class Part2
{
    public static void main(String[] args)
    {
        double grams = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of grams: ");
        grams = in.nextDouble();

        System.out.println(grams + " grams is " + grams/453.592 + " pounds.");
    }
}
