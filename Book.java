/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Don Santiago
 * @version December 3rd 2024
 */
class Book
{
    // The fields.
    private String author; //store input name of author line within "quotations" in live
    private String title; //store input name of title of book within "quotations" in live
    private int pages; //store integer of numbers
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
     * ##need to return pages, currently prints zero
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
        System.out.println("The title of this book is called "+title+".");
    }
    
    /**
     * print the title of the book
     */
    public void printAuthor()
    {
        System.out.println("The book was written by "+ author+".");
    }
    
    /**
     * print a string that includes the total number of pages of the book
     * the authors name and the title of the text
     */
    public void print()
    {
        System.out.println(title+" by the author "+author+" contains a total of "+pages+" pages in the book.");
    }
    
    /**
     * this should allow for the input of a reference number
     */
    public void setRefNumber(String ref)
    {
        
    }
    // Add the methods here ...
}