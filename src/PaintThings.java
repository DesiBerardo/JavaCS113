//***********************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
//***********************************************************
import java.text.DecimalFormat;
public class PaintThings
{
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        //put these in an array dumbass
        Rectangle deck = new Rectangle(20 , 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        Shape[] s = new Shape[3];
        s[0] = deck;
        s[1] = bigBall;
        s[2] = tank;
        double deckAmt, ballAmt, tankAmt;
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
// Instantiate the three shapes to paint
// Compute the amount of paint needed for each shape
// Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}