import java.util.Scanner;
public class TestEvens
{
    public static int SmallEven(int[] numArray, int target)
    {
        int count = 0;
        for (int value : numArray)
            if (value < target)
                if (value % 2 == 0)
                    count++;
        return count;
    }
    public static void main(String[] args)
    {
        int[] array = {2, 7, 8, 3, 4, 10};
        int num;
        int result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a target: ");
        num = in.nextInt();

        result = SmallEven(array, num);

        System.out.println(result);
    }
}
