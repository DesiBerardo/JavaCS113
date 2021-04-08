import java.util.*;
public class GraduatingClass
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of class: ");
        int total = 0;

        int size = in.nextInt();

        System.out.println("Enter threshold gpa: ");
        GPA threshold = new GPA(in.nextDouble());

        Student2[] students = new Student2[size];

        for (int i = 0; i < students.length; i++)
        {
            GPA gpa = new GPA(Math.random() * 4);
            students[i] = new Student2(in.nextLine(), gpa);

            if (students[i].honorRoll(threshold))
                total++;
        }

        System.out.println(total);

    }
}
