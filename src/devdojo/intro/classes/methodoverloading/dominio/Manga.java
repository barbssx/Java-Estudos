/* constructors, are responsible for creating the object in memory, that is, instantiating the class that was defined */

package devdojo.intro.classes.methodoverloading.dominio;

public class Manga {
    private String name;
    private String genre;
    private int numChapters;
    private String studio;

    public Manga (String name, String genre, int numChapters) {
        this.name = name;
        this.genre = genre;
        this.numChapters = numChapters;
    }

    public Manga (String name, String genre, int numChapters, String studio) {
        this(name, genre, numChapters); // fist line and only inside the constructor
        this.studio = studio;

    }

    public void printing(){
        System.out.println((this.name));
        System.out.println((this.genre));
        System.out.println((this.numChapters));
        System.out.println((this.studio));
        System.out.println("------------------");
    }
}
