public class TravelKitTest
{
    public static void main(String[] args)
    {
        Shampoo shampoo1 = new Shampoo("Clorox", 5);
        Shampoo shampoo2 = new Shampoo("Dove", 6);
        Toothpaste toothpaste1 = new Toothpaste();
        toothpaste1.setSize(3);
        Toothpaste toothpaste2 = new Toothpaste();
        toothpaste2.setSize(7);

        TravelKit travelKit1 = new TravelKit(shampoo1, toothpaste1);
        TravelKit travelKit2 = new TravelKit(shampoo2, toothpaste2);

        System.out.println("Travel kit 1 info: " + travelKit1.getShampoo() + " | " +travelKit1.getToothpaste());
        System.out.println("Travel kit 2 info: " + travelKit2.getShampoo() + " | " +travelKit2.getToothpaste());

        System.out.println(travelKit1.getTotalSize());
        System.out.println(travelKit2.getTotalSize());
    }
}
