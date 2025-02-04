package devdojo.intro.classes.methods.dominio;

public class Calculator {
   public void sumNumbers(){
      System.out.println(5+10);
   }

   public void subNumbers(){
      System.out.println(5-10);
   }

   public void multNumbers(int a, int b){
      System.out.println(a*b);
   }

   public double divisionNumbers(double a, double b){
      if (a == 0 || b == 0){
         System.out.println("Division by zero");
         return a;
      }
      System.out.println(a/b);
       return a/b;
   }

   public double divisionNum(double a, double b){
      if (a == 0 || b == 0){
         return 0;
      }
      return a/b;
   }

   public double divisionNum2 (double a, double b){
      if (a != 0 || b != 0){
         System.out.println(a/b);
      }
      return 0;
   }
}
