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
    public static void main(String[] args)
    {
        Random rand = new Random();

        int number = rand.nextInt(3);

        if (number == 0)
            System.out.println("Oxtail ya fuckin nerd");
        else if (number == 1)
            System.out.println("Applebapple ya fuckin nerd");
        else if (number == 2)
            System.out.println("Costellos ya fuckin nerd");

    }
}