public class Dog
{
    private String name;
    private int age;

    public Dog()
    {
        name = "dog";
        age = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int toPersonYears()
    {
        return age * 7;
    }

    public String toString()
    {
        return  "name: " + name + ", age: " + age;
    }
}
