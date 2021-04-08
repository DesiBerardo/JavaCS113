public class Student2
{
    private String name;
    private GPA gpa;

    public Student2(String n, GPA g)
    {
        name = n;
        gpa = g;
    }

    public GPA getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean honorRoll(GPA target)
    {
        return gpa.compareTo(target) >= 0;
    }

    public String toString()
    {
        return name + " " + gpa;
    }


}