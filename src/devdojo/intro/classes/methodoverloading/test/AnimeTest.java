package devdojo.intro.classes.methodoverloading.test;

import devdojo.intro.classes.methodoverloading.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.setName("Naruto");
        anime1.setGenre("Fantasy");
        anime1.setNumEpisodes(300);
        anime1.printing();

        //-------------------------------------------init
        anime2.init("Solo leveling", "fantasy", "anime", 17);
        anime2.printing();

    }

}
