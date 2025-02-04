package devdojo.intro.classes.methods.dominio;

public class VarArgs {
    public void sumNumbers(int... numbers) {
       int sum = 0;
       for (int number : numbers) {
           sum += number;
        }
        System.out.println(sum);
    }
}
