
package publicationproject;


public class Magazine extends Publication {
    
    private String publisher;
    
    public Magazine(String Publisher, String Title, Genre Genre, int Edition, int Year) {
        super(Title, Genre, Edition, Year);
        this.publisher = Publisher;
    } 
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre.name() + " magazine by " + publisher);
        super.printFooter();
    }
}
