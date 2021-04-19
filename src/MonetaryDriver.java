public class MonetaryDriver
{
    public static void main(String[] args)
    {
        MonetaryCoin[] c = new MonetaryCoin[35];//
        int count = 0;
        int total = 0;

        for (int i = 0; i < 35; i++)
        {
            c[i] = new MonetaryCoin((int)(Math.random() * 100));
            c[i].flip();

            if (c[i].isHeads())
            {
                count++;
                total += c[i].getCents();
            }
        }
        System.out.println( "The average cents with coin with head face is: " + total / count);
    }
}