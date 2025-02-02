//for with continue
package devdojo.introducao;

public class Class06LoopStructures05 {
    public static void main(String[] args) {

        double carValue = 30000;

        for (int payment = (int) carValue; payment >= 1; payment--) {
            double paymentValue = carValue / payment;
            if (paymentValue < 1000) {
                continue;
            }
            System.out.printf("Payment %s $: %.2f %n", payment, paymentValue);

        }



    }
}
