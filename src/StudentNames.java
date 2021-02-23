import java.util.Scanner;
public class StudentNames
{
    public static void main(String[] args)
    {
        String student1, student2, student3, initials;
        double averageLength;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first student:");
        student1 = in.next();
        System.out.println("Enter second student:");
        student2 = in.next();
        System.out.println("Enter second student:");
        student3 = in.next();

        averageLength = (student1.length() + student2.length() + student3.length()) / 3.0;
        initials = String.valueOf(student1.charAt(0)) + String.valueOf(student2.charAt(0)) + String.valueOf(student3.charAt(0));

        System.out.println(averageLength);
        System.out.println(initials);
    }
}