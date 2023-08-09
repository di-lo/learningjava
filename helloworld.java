public class LearningJava{ //starts with capitals

  static final int MAX_AGE = 100; // naming constant variables
  public static void main(String[] args){ // args (arguments) stores arguments that are given
    sayHi(); // Hello World!
  }

  static void sayHi(){ // method // void is used for not returning
    System.out.println("Hello World!");
  }

  static void conditionalOpt(){
    int a = (7 < 3) ? 7: 3; // if 7 is less than 3, return 7 otherwise return 3
    System.out.println(a); // 3
    
    String hi = "hello";
    double result = hi.equals("hello") ? 0.5 : 0.25; // if hi equals to "hello", return 0.5 otherwise return 0.25
    System.out.println(result); // 0.5
  }

  static void pizzaTypes(){
    String pizza1 = "margarita"; // initialization 
    String pizza2; // declaration
    pizza2 = "bbq"; // assignment
  }
  
}


