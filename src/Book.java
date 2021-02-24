public class Book
{
    private int pages;
    private String title;

    public Book(int p, String t)
    {
        pages = p;
        title = t;
    }

    public int getPages()
    {
        return pages;
    }

    public String getTitle()
    {
        return title;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String toString()
    {
        return "Title: " + title + " pages: " + pages;
    }

    public boolean equals(Book b1, Book b2)
    {
        if (b1.getPages() == b2.getPages() && b1.getTitle().equals(b2.getTitle()))
            return true;
        else
            return false;
    }

    public int compareTo(Book b1, Book b2)
    {
        if (b1.getPages() < b2.getPages())
            return -1;
        else if (b1.getPages() > b2.getPages())
        {
            return 1;
        }
        else
            return 0;
    }

}
