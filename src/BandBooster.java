public class BandBooster
{
    private String name;
    private int boxesSold;

    public BandBooster(String nameBand)
    {
        name = nameBand;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public int getBoxesSold() {
        return boxesSold;
    }

    public void updateSales(int moreBoxes) {
        boxesSold += moreBoxes;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}