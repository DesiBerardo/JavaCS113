public class Firm
{
    public static void main(String[] args)
    {
        Staff personnel = new Staff();

        for (int i = 0; i < personnel.staffList.length - 1; i++)
            System.out.println(personnel.staffList[i].vacation());
    }
}