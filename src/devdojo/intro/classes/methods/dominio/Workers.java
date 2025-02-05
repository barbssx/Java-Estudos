package devdojo.intro.classes.methods.dominio;

import java.util.Arrays;

public class Workers {
    private String name;
    private int age;
    private double[] payments;
    private double averagePayments;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getPayments() {
        return payments;
    }

    public void setPayments(double[] payments) {
        this.payments = payments;
    }

    public double getAveragePayments() {
        return averagePayments;
    }
}
