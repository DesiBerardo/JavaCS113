public class MyMethods
{
    public static int surface(int length, int width, int height)
    {
        return 2 * (length * width) + 2 * (length * height) + 2 * (height * width);
    }

    public static void swapFaceValues(Die die1, Die die2)
    {
        int temp;
        temp = die1.getFaceValue();
        die1.setFaceValue(die2.getFaceValue());
        die2.setFaceValue(temp);
    }
}
