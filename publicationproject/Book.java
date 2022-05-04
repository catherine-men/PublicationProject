
package publicationproject;


public class Book extends Publication {
    
    private String author;
    
    public Book(String Author, String Title, Genre Genre, int Edition, int Year)
    {
        super(Title, Genre, Edition, Year);
        this.author = Author;
    }
    
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre.name() + " book by " + author);
        super.printFooter();
    }
   
}
