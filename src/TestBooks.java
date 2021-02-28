import java.util.Scanner;

public class TestBooks
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String title = "";
        int pages = 0;
        int count = 1;
        int totalPages = 0;
        boolean loop = true;
        System.out.println("Enter title of book (0 to exit): ");
        if (in.next().equals("0"))
            loop = false;
        else
            title = in.next();

        System.out.println("Enter amount of pages (0 to exit): ");
        if (in.nextInt() == 0)
            loop = false;
        else
            pages = in.nextInt();
        Book book1 = new Book(pages, title);
        Book book2 = new Book(pages, title);
        totalPages = pages;

        while (loop)
        {
            System.out.println("Enter title of book (0 to exit): ");
            if (in.next().equals("0"))
                break;
            else
                title = in.next();

            System.out.println("Enter amount of pages (0 to exit): ");
            if (in.nextInt() == 0)
                break;
            else
                pages = in.nextInt();

            book2.setPages(pages);
            book2.setTitle(title);
            count++;
            totalPages += pages;

            if (book1.compareTo(book1, book2) == 1)
            {
                book2 = book1;
            }
        }
        System.out.println("The smallest book was: " + book2);
        System.out.println("The average number of pages is: " + totalPages / count);
    }
}
