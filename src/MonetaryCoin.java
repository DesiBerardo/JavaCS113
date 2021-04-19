public class MonetaryCoin extends Coin
{
    int cents;

    public MonetaryCoin(int c)
    {
        super();
        cents = c;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public String toString()
    {
        return "Face: " + super.toString() + " | Worth: " + cents;
    }
}
