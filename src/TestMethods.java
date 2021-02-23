import java.util.Scanner;

public class TestMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length, width, height;
        MyMethods methods = new MyMethods();
        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("Enter legnth: ");
        length = in.nextInt();
        System.out.println("Enter width: ");
        width = in.nextInt();
        System.out.println("Enter height: ");
        height = in.nextInt();

        System.out.println("Total surface area is: " + methods.surface(length, width, height));
        System.out.println("----------------------------------------------------");

        System.out.println(die1);
        System.out.println(die2);

        System.out.println();
        methods.swapFaceValues(die1, die2);
        System.out.println("With swapFaceValues: ");
        System.out.println(die1);
        System.out.println(die2);
    }
}
