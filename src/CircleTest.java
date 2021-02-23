import java.util.Random;
import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        Point point1 = new Point(random.nextInt(10) + 1, random.nextInt(10) + 1);
        Point point2 = new Point(random.nextInt(10) + 1, random.nextInt(10) + 1);
        System.out.println("Please enter radius: ");
        Circle circle1 = new Circle(point1, in.nextDouble());
        Circle circle2 = new Circle(point2, 5.5);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("The distance between their centers is: " + circle1.getCenter().distance(circle2.getCenter()));
    }
}