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
    
    /**
     * still have to do 2.90/2.91/2.92
     * December 3rd, 2024
     * 
     * for 2.90 edit information in block starting line 28. the changes here are to make sure that the input is a minimum of 3 values alpha numeric
     * for 2.91 add new method for a counter called "borrow", each time it is called add 1 to the counter, store the number, modify block starting at line 88 to update with counter.
     * for 2.92 add new method called "isCourseText", if true then print out it is a necessity for a course, if false print out it is not a necessity. if book is for a course provide this information in block starting line 17.
     */
    
}