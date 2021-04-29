import java.util.Scanner;
import java.util.Random;
// write a method reverseArray that tskes an array of integters as a parameter, called numArray
// Write a program that prompts the user for an integer, then asks the user to enter that many values. Store these values in an
//array and print the array. Then reverse the array elements so that the first element becomes the last element, the second
//element becomes the second to last element, and so on, with the old last element now first. Do not just reverse the order in
//which they are printed; actually change the way they are stored in the array. Do not create a second array; just rearrange the
//elements within the array you have. (Hint: Swap elements that need to change places.) When the elements have been
//reversed, print the array again.



public class Lab
{
    public static boolean checkString(String s)
    {
        if (s.length() <= 1)
            return true;
        else
            return s.charAt(0) == s.charAt(1) && checkString(s.substring(1));
    }

    public static int recProd(int[] array, int count)
    {
        if (count ==1)
            return array[0];
        return array[count - 1] * recProd(array, count -1);
    }

    public static int power(int base, int expo)
    {
        if (expo == 0)
            return 1;
        else if (expo == 1)
            return base;
        else
        return power(base, expo - 1) * base;
    }
}