package devdojo.introducao;

public class Class07Arrays03 {
    public static void main(String[] args) {

        int [] num = new int [] {1,2,3,4,5};

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }


        int [] num2 = {1,6,3,9,5};

        for (int number : num2){
            System.out.println(number);
        }
    }
}
