/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Don Santiago
 * @version September 10th 2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages=0;
    }

    /**
     * return the title of the book
     */
    public String getTitle()
    {
        return title;     
    }

    /**
     * return the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * print page counter of book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * print the name of the author
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * print the title of the book
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * print a string that includes the total number of pages of the book
     * the authors name and the title of the text
     */
    public void print()
    {
        System.out.println(title+" by the author"+author+" contains a total of "+pages+" pages in the book");
    }
    
    /**
     * this should allow for the input of a reference number
     */
    public void setRefNumber(String ref)
    {
        
    }
    // Add the methods here ...
}