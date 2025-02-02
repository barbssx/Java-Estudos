package devdojo.introducao;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {

        //IF
        int age = 15;
        boolean isAuthorized = age >= 18;

        if (!isAuthorized) {
            System.out.println("Not authorized");
        } else {
            System.out.println("Authorized");
        }


    }
}
