/*
* Switch case
* char, int, byte, short, enum, String
*/

package devdojo.introducao;

public class Class05ConditionalStatements05 {
    public static void main(String[] args) {
        //Print the day of week, must have sunday
    byte day = 11;

    switch (day){
        default:System.out.println("Invalid number"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;

        }

        String sex = "F";
        switch (sex) {
        case "M": System.out.println("Male"); break;
        case "F": System.out.println("Female"); break;
        default: System.out.println("Unknown"); break;
    }
    }
}
