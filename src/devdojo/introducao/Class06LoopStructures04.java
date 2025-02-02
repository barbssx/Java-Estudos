//for with break
package devdojo.introducao;

public class Class06LoopStructures04 {
    public static void main(String[] args) {

        double carValue = 100000;

        for (int payment = 1; payment <= carValue; payment++) {
            double paymentValue = carValue / payment;
            if (paymentValue >= 1000) {
                System.out.printf("Payment %s $: %.2f %n", payment, paymentValue);
            }else{
                break;
            }


        }



    }
}
