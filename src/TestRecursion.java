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

    public static void pascalTriangle(int n, int[] array, int i)
    {
        if (n == 1)
        {
            System.out.println(n);
        }
        else
        {

        }
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public static void main(String[] args)
    {
        int[] numArray = {1,2,3,4,5};
        printDigits(12345);
        System.out.println(sumArray(numArray, numArray.length - 1));

        print(10);

    }
}