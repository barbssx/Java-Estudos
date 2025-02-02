/*Given the values from 1 to 7, display on the screen whether the day is a business or a weekend.
Considering Sunday as 1.*/

package devdojo.introducao;

public class Class05ConditionalStatements05Exerc {

    public static void main(String[] args) {

        byte day =7;
        switch (day){
            case 1: System.out.println("Sunday: Weekend"); break;
            case 2: System.out.println("Monday: Business day"); break;
            case 3: System.out.println("Tuesday: Business day"); break;
            case 4: System.out.println("Wednesday: Business day"); break;
            case 5: System.out.println("Thursday: Business day"); break;
            case 6: System.out.println("Friday: Business day"); break;
            case 7: System.out.println("Caturday: Weekend"); break;
            default: System.out.println("Invalid day");
        }


        //OR

        byte dayday = 2;
        switch (dayday){
        case 1: case 7: System.out.println("Weekend"); break;
        case 2: case 3: case 4: case 5: case 6: System.out.println("Business day"); break;
        default: System.out.println("Invalid day"); break;

        }
    }
}
