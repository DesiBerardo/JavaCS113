import java.util.Scanner;

public class TestBooks
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String title = "";
        int pages = 1000000000;
        int count = 0;
        int totalPages = 0;
        boolean loop = true;

        Book book1 = new Book(pages, title);
        Book book2 = new Book(pages, title);

        while (loop)
        {
            System.out.println("Enter title of book (0 to exit): ");
            title = in.next();
            if (title.equals("0"))
                break;

            System.out.println("Enter amount of pages: ");
            pages = in.nextInt();

            book1.setPages(pages);
            book1.setTitle(title);
            count++;
            totalPages += pages;

            if (book1.compareTo(book1, book2) == -1)
            {
                System.out.println("check");
                book2.setTitle(book1.getTitle());
                book2.setPages(book1.getPages());
            }
        }
        if (count == 0)
            System.out.println("No books entered.");
        else
        {
            System.out.println("The smallest book was: " + book2);
            System.out.println("The average number of pages is: " + totalPages / (float) count);
        }
    }
}
