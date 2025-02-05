package devdojo.intro.classes.methods.test;

import devdojo.intro.classes.methods.dominio.Workers;

public class WorkersPrinting {

    public static void main(String[] args) {
        Workers worker1 = new Workers();
        Workers worker2 = new Workers();

    worker1.setName("Jinwoo");
    worker1.setAge(25);
    worker1.setPayments(new double[] {2000,5000,1200});
    worker1.printing();
    worker1.getAveragePayments();


        System.out.println("-------------------------");

   worker2.setName("Chen");
   worker2.setAge(25);
   worker2.setPayments(new double[] {4000, 2200, 3100});
   worker2.printing();
   worker2.averagePayments();

}}
