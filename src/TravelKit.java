public class TravelKit
{
    private Toothpaste toothpaste;
    private Shampoo shampoo;

    TravelKit(Shampoo shampoo1, Toothpaste toothpaste1)
    {
        shampoo = shampoo1;
        toothpaste = toothpaste1;
    }

    public Shampoo getShampoo() {
        return shampoo;
    }

    public Toothpaste getToothpaste() {
        return toothpaste;
    }

    public void setShampoo(Shampoo shampoo1) {
        shampoo = shampoo1;
    }

    public void setToothpaste(Toothpaste toothpaste1) {
        toothpaste = toothpaste1;
    }

    public int getTotalSize()
    {
        return toothpaste.getSize() + shampoo.getWeight();
    }
}
