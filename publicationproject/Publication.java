//Catherine Men
//895190874

package publicationproject;

enum Genre{SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT, THRILLER}
public class Publication implements Comparable<Publication> {
    
    private String title;
    protected Genre genre;
    private int edition;
    private int year;
    
    public Publication(String Title, Genre Genre, int Edition, int Year)
    {
        title = Title;
        genre = Genre;
        edition = Edition;
        year = Year;
    }
    public void printInfo()
    {
        System.out.println(title + " Edition " + "(" + edition + ")" + " published in " + year);
    }
    public void printFooter()
    {       
     System.out.println("All rights reserved." + "\n" + "---------------------");
    }
    @Override
    public int compareTo(Publication other) 
    {
        if (genre.name().compareTo(other.genre.name())!=0)
            return genre.name().compareTo(other.genre.name());
        else return title.compareToIgnoreCase(other.title); 
    }
    
}
