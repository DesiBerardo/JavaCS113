import java.util.Scanner;
public class NumberRange
{
    public static void main(String[] args)
    {
        int[] range = new int[51];
        int input;
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?: ");
        input = in.nextInt();

        for (int i = 0; i < input; i++)
        {
            System.out.println("Please enter a number between 0 and 50:");
            range[in.nextInt()]++;
        }

        for (int i = 0; i < range.length; i++)
        {
            if(range[i] > 0)
                System.out.println(i + ": " + range[i]);
        }
    }
}
