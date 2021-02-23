public class Circle
{
    private Point center;
    private double radius;

    public Circle(Point c, double r)
    {
        center = c;
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String toString() {
        return "Circle has a radius of " + radius + " and a center of " + center;
    }
}
