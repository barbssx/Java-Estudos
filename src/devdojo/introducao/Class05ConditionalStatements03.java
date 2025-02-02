// Ternary operator
// Used for simple if statements

package devdojo.introducao;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {

        double payment = 5500;
        int age = 18;
        String donation;

        donation = age >= 18 && payment >= 5000 ? "You can donate." : "Sorry, you are not authorized to donate";
        System.out.println(donation);


        //Bad Habit
       int age2 = 15;
       String category;

       category = age2 >= 18 ? "Adult" : age2 >= 15 && age2 < 18 ? "Juvenile" : "Child";
       System.out.println(category);
    }
}
