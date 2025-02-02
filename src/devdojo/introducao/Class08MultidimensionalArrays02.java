package devdojo.introducao;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int [] arrayBase : array){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
