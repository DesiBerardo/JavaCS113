import java.util.*;

public class NameApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String firstName;
        String lastName, lastFive;
        char firstChar;
        int number = rand.nextInt(99) + 1;

        System.out.println("Enter First Name: ");
        firstName = in.next();
        System.out.println("Enter Last name: ");
        lastName = in.next();

        firstChar = firstName.charAt(0);
        lastFive = lastName.substring(0, 4);


        System.out.println(firstChar + lastFive + number);
    }
}
