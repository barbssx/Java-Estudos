// while; do-while; for

package devdojo.introducao;

public class Class06LoopStructures01 {
    public static void main(String[] args) {

        // while
        byte num = 0;
        while (num <= 10){
            System.out.println("The count is in:"+ num++);
        }


        // do-while
        byte day = 5;
        do {
            System.out.println("The count is in:"+ day++);
        } while (day <= 10);


        //for
        for (int i =10; i<= 20; i++){
            System.out.println("We are in: "+i);
        }
    }

}
