public class TestStudent
{
    public static void main(String[] args)
    {
        Student student1, student2;

        student1 = new Student();
        student2 = new Student();

        student1.setName("John");
        student1.setMidterm1(90);
        student1.setMidterm2(85);

        student2.setName("Jill");
        student2.setMidterm1(88);
        student2.setMidterm2(98);

        System.out.println("John average midterm score: " + student1.average());
        System.out.println("Jill average midterm score " + student2.average());

        System.out.println("Both students midterm 2 average score: " + (student1.getMidterm2() + student2.getMidterm2()) / 2.0);

        System.out.println(student1);
        System.out.println(student2);


    }
}
