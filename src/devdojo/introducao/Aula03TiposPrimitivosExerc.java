
// Print the following message using primitive variables

// I, <name>, living at <address>, confirm the receipt of the payment <payment> on <date>.


package devdojo.introducao;

public class Aula03TiposPrimitivosExerc {
    public static void main(String[] args) {
        String name = "Barbara";
        String address = "Strada General Traian Moșoiu 24, Bran 507025, Romania";
        short payment = 1000;
        String paymentDate = "07/01/2025";

        String report = "I, "+name+", living at "+address+", confirm the receipt of the payment "+payment+", on "+paymentDate+".";

        System.out.println(report);
    }
}
