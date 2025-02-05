/*
Encapsulation consists of hiding the internal details of a class,
making its attributes private and providing public methods to access and modify them in a controlled way.
*Setters are methods that modify the value of a private attribute.
*Getters are methods that return the value of a private attribute.
*Init in Java typically refers to constructors or initialization blocks.
*📌 If the object needs to be modified after it is created, use getters and setters.
*📌 If the object must be immutable after creation, use a constructor (init) without setters.
*/

package devdojo.intro.classes.methodoverloading.dominio;

public class Anime {
    private String name;
    private String genre;
    private String type;
    private int numEpisodes;

    public void printing(){
        System.out.println((this.name));
        System.out.println((this.genre));
        System.out.println((this.type));
        System.out.println((this.numEpisodes));
        System.out.println("------------------");
    }


    public void init(String name, String genre, String type, int numEpisodes  ) {
        this.name = name;
        this.type = type;
        this.genre = genre;
        this.numEpisodes = numEpisodes;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setNumEpisodes(int numEpisodes){
        this.numEpisodes = numEpisodes;
    }

    public int getNumEpisodes(){
        return numEpisodes;
    }

}
