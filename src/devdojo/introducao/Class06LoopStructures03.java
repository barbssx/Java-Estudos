//for with break

package devdojo.introducao;

public class Class06LoopStructures03 {
    public static void main(String[] args) {

        double maxValue = 50;

        for (int i = 0; i < maxValue; i++){
            if (i > 25){
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
