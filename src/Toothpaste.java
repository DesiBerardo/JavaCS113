public class Toothpaste
{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int newSize)
    {
        size = newSize;
    }

    @Override
    public String toString() {
        return  "Toothpaste size=" + size;
    }
}
