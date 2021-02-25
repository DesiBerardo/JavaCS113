import java.util.Scanner;
import java.util.Random;
public class Lab
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int LIMIT;
        int count = 1;
        int loop;
        System.out.println("How many times to print: ");
        loop = in.nextInt();
        if (loop < 0)
            System.out.println("error, number not greater than 0");
        else
        {
            LIMIT = loop;
            int sum = 0;
            while (count <= LIMIT)
            {
                System.out.println(count + " I love Computer Science!!");
                sum+=count;
                count++;
            }
            System.out.println("Total printed messages: " + (count - 1) + " Total sum is " + sum);
        }

    }
}
