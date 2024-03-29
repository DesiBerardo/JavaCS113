// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        int max = 0;
        int min = sales[0];
        int id = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > max)
            {
                max = sales[i];
                id = i;
            }
            if (sales[i] < min)
                min = sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average: " + (double)sum / SALESPEOPLE);
        System.out.println("Minimum sales: " + min);
        System.out.println("Maximum sales:" + max + ". ID number: " + (id + 1));

        System.out.println("Enter a target sales value: ");
        int target = scan.nextInt();
        int total = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > target)
            {
                System.out.println("Salesperson " + (i + 1) + " exceeds target. Sales: " + sales[i]);
                total++;
            }
        System.out.println("Total number of employees who exceeded target is: " + total);
    }
}