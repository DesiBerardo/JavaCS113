public class Shampoo
{
    private String shampooName;
    private int weight;

    public Shampoo(String name, int firstWeight)
    {
        shampooName = name;
        weight = firstWeight;
    }

    public int getWeight() {
        return weight;
    }

    public String getShampooName() {
        return shampooName;
    }

    public void setShampooName(String name) {
        shampooName = shampooName;
    }

    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }

    public String toString() {
        return "Shampoo Name='" + shampooName + ", weight=" + weight;
    }
}
