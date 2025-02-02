package devdojo.introducao;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {

        int age = 13;
        String category;

        if (age >= 18) {
            category = "Adult";
        } else if (age >= 15 && age < 18) {
            category = "Juvenile";
        } else {
            category = "Child";
        }
        System.out.println(category);



    }
}
