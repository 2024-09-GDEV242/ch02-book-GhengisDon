/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Don Santiago
 * @version December 8th 2024
 */
class Book
{
    // The fields.
    private String author; //store input name of author line within "quotations" in live
    private String title; //store input name of title of book within "quotations" in live
    private int pages; //store integer of numbers as pages in live
    private String ref; //store input of a reference number within "quotations" in live
    private int borrowCounter=0;//store integer of number of times book is borrowed, set to zero for each object in live.
    private boolean isCourseText;//store requirement of true or false for each object in live
    
    /**
     * Set the directory information fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,String refValue, int bookPages,boolean isCourseText)
    {
        author = bookAuthor; //information saved as bookAuthor, returned as just author
        title = bookTitle; //information saved as bookTitle, returned as just title
        pages = bookPages; //information saved as bookPages, returned as just pages
        ref=refValue;//information saved as refValue, returned as ref
        isCourseText=isCourseText;//true or false if book is required as textbook reading,
    }
    
    /**
    * this should allow for modifications to reference number
    * 
    * Assign multiple behaviors for requirements to be refValue.
    * if the field has an entry and it is at minimum character size of at least "3"
    * and the field has entries that only have characters within the set of a-z,A-Z,0-9
    * then save, otherwise return
    */
    public void setRefNumber(String refValue)
    {
        if (refValue != null && refValue.length()>= 3 && refValue.matches("[a-zA-Z0-9]+"))
        ref=refValue;
    else{
        System.out.println("Error:Reference must be 3 alphanumeric");}
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
         * assign a true or false value to isCourseText
         */
        public void setIsCourseText(boolean value)
        {
            isCourseText=value; //set a true or false
        }
        
    /**
    * increase the current borrow count of the object
    */
    public void borrow(){
        borrowCounter++;
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
     * print message of course book requirement
     */
    public void printCourseTextInfo(){
        if (isCourseText){
            System.out.println("The book "+title +". "+ref +" by "+author+" has been assigned as a requirement for a class"+".");
        }else{
                System.out.println("This book is not required.");
            }
        }
    }