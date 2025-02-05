package devdojo.intro.classes.methodoverloading.test;

import devdojo.intro.classes.methodoverloading.dominio.Manga;

public class MangaTest {
    public static void main(String[] args) {
        Manga m = new Manga("Shingeki No Kiojinn", "horror", 110);
        m.printing();


        Manga ma = new Manga("Solo leveling", "fantasy", 17, "Sword art");
        ma.printing();
    }
}
