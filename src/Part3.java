import java.util.Scanner;

public class Part3
{
    public static void main(String[] args)
    {
        int milligrams, kilograms, grams, milligramsFinal;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount of milligrams: ");
        milligrams = in.nextInt();

        kilograms = milligrams / 1000000;
        grams = (milligrams - (kilograms * 1000000))/ 1000;
        milligramsFinal = (milligrams - (kilograms * 1000000 + grams * 1000));

        System.out.println("That is equivalent to " + kilograms + " kilograms, " + grams + " grams, and " + milligramsFinal +  " milligrams");
    }
}
