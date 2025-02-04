package devdojo.intro.classes.methods.dominio;

import java.util.Arrays;

public class Workers {
    public String name;
    public int age;
    public double[] payments;

    public void printing() {
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(Arrays.toString(this.payments));

    }

    public void averagePayments(){
        double sum = 0;
        for (double payment : payments){
            sum += payment;
        }

        double average = sum/payments.length;
        System.out.println(average);
    }


}
