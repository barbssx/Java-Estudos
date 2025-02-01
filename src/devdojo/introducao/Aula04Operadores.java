package devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {


        int a = 10;
        double b = 20;


        // Arithmetic   +-*/


        double addition = a+b;
        double subtraction = a-b;
        double division = a/b;
        double multiplication = a*b;

        System.out.println("addition: "+addition);
        System.out.println("subtraction: "+subtraction);
        System.out.println("division: "+division);
        System.out.println("multiplication: "+multiplication);


        // Relational    = >< !=
        boolean AIsGreaterThanB = a>b;
        boolean AIsLessThanB = a<b;
        boolean AIsEqualB = a==b;
        boolean AIsNotEqualB = a!=b;
        boolean AIsEqualA = a==a;

        System.out.println("A is greater than b= "+ AIsGreaterThanB);
        System.out.println("A is less than b= "+ AIsLessThanB);
        System.out.println("A is equal to b= " + AIsEqualB);
        System.out.println("A is not equal to b= " + AIsNotEqualB);
        System.out.println("A is equal to a= " + AIsEqualA);


        // Logics - && (and)
        int age = 25;
        double payment = 4000;
        boolean NetherlandsLawGreaterThan30 = age > 30 && payment >= 4500;
        boolean NetherlandsLawLessThan30 = age < 30 && payment >= 3300;

        System.out.println("NetherlandsLawGreaterThan30 = "+NetherlandsLawGreaterThan30);
        System.out.println("NetherlandsLawLessThan30 = "+NetherlandsLawLessThan30);


        // Logics - || (or)
        double account = 50;
        double savings = 100;
        double supermarketGroceries = 125;

        boolean canIPayForThis = account > supermarketGroceries || savings > supermarketGroceries || account + savings > supermarketGroceries;
        System.out.println(canIPayForThis);









    }
}
