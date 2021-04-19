public class MonetaryDriver
{
    public static void main(String[] args)
    {
        MonetaryCoin c = new MonetaryCoin((int)(Math.random() * 100));

        c.flip();

        System.out.println(c);
    }
}
