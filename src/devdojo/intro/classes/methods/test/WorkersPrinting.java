package devdojo.intro.classes.methods.test;

import devdojo.intro.classes.methods.dominio.Workers;

public class WorkersPrinting {

    public static void main(String[] args) {
        Workers worker1 = new Workers();
        Workers worker2 = new Workers();

    worker1.name = "John";
    worker1.age = 25;
    worker1.payments = new double[] {2000,5000,1200};
    worker1.printing();
    worker1.averagePayments();


        System.out.println("-------------------------");

    worker2.name = "Heather";
    worker2.age = 26;
    worker2.payments = new double [] {1300,4000,8000};
    worker2.printing();
    worker2.averagePayments();

}}
