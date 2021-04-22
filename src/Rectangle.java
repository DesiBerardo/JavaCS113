public class Rectangle extends Shape
{
    private double length, width;

    public Rectangle(double l, double w)
    {
        super("rectangle");
        length = l;
        width = w;
    }

    public double area()
    {
        return length * width;
    }

    public String toString()
    {
        return super.toString() + length + width;
    }
}
