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

    public boolean equals(Book b2)
    {
        if (getPages() == b2.getPages() && getTitle().equals(b2.getTitle()))
            return true;
        else
            return false;
    }

    public int compareTo(Book b2)
    {
        if (getPages() < b2.getPages())
            return -1;
        else if (getPages() > b2.getPages())
        {
            return 1;
        }
        else
            return 0;
    }

}
