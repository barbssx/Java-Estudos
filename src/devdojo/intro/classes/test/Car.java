package devdojo.intro.classes.test;

import devdojo.intro.classes.dominio.CarProfile;

public class Car {
    public static void main(String[] args) {
        CarProfile car1 = new CarProfile();
        CarProfile car2 = new CarProfile();

        car1.name = "Corsa";
        car1.modelo = "Chevrolet";
        car1.year = 2018;

        car2.name = "BMW";
        car2.modelo = "XT";
        car2.year = 2020;

        System.out.print(car1.name + " " + car1.modelo + " " + car1.year+"\n\n");
        System.out.print(car2.name + " " + car2.modelo + " " + car2.year);


    }
}
