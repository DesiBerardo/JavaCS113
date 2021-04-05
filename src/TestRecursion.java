public class TestRecursion
{
    public static void printDigits(int num)
    {
        if (num < 10)
            System.out.println(num);
        else
        {
            printDigits(num / 10);
            System.out.println(num % 10);
        }
    }

    public static int sumArray(int[] array, int i)
    {
        if (i < 1)
            return array[0];
        else
        {
            return array[i] + sumArray(array, i - 1);
        }
    }

    public static void pascalTriangle(int n)
    {

    }

    public static void main(String[] args)
    {
        int[] numArray = {1,2,3,4,5};
        printDigits(12345);
        System.out.println(sumArray(numArray, numArray.length - 1));

    }
}