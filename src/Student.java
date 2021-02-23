public class Student
{
    private String name;
    private int midterm1;
    private int midterm2;

    public Student()
    {
        name = "";
        midterm1 = 0;
        midterm2 = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }
    public void setMidterm1(int score)
    {
        midterm1 = score;
    }
    public void setMidterm2(int score)
    {
        midterm2 = score;
    }

    public int getMidterm1() {
        return midterm1;
    }

    public int getMidterm2() {
        return midterm2;
    }

    public String getName() {
        return name;
    }

    public double average()
    {
        return (midterm2 + midterm1) / 2.0;
    }

    public String toString() {
        return "Name: " + name + " | Midterm 1 score: " + midterm1 + " | Midterm 2 score: " + midterm2;
    }
}
