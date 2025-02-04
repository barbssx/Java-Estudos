package devdojo.intro.classes.methods.test;

import devdojo.intro.classes.methods.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {

        Calculator division = new Calculator();
        double result = division.divisionNumbers(10, 2);
        System.out.println(result);
    }
}
