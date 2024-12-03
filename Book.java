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
    private int pages; //store integer of numbers as pages in live
    private String ref; //store input of a reference number within "quotations" in live

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages)
    {
        author = bookAuthor; //information saved as bookAuthor, returned as just author
        title = bookTitle; //information saved as bookTitle, returned as just title
        pages = bookPages; //information saved as bookPages, returned as just pages
    }
    
    /**
    * this should allow for the input of a reference number
    */
    public void setRefNumber(String refValue)
    {
        ref=refValue; //information saved as refValue, returned as ref 
    }
        
    /**
     * The following indented block is stuff that helps us to check exactly what is stored and where.
     * The other nonindented block is all the callable method calls that should print out the stored information.
     */
        /**
         * show what the current objects title is
         */
        public String getTitle()
        {
            return title; //show information stored in title     
        }
    
        /**
         * show who the current objects author is
         */
        public String getAuthor()
        {
            return author; //show information stored in author
        }
        
        /**
         * show the page count that was stored on the object
         */
        public int getPages()
        {
            return pages; //show numeric information stored in pages
        }
    
        /**
         * show the reference number of the book that was assigned to the object
         */
        public String getRefNumber()
        {
            return ref; //show the reference number that was stored on the object
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
     * print out the value that was assigned to the reference number
     */
    public void printRef()
    {
        System.out.println("The reference value assigned to this book is "+ref+".");
    }
}