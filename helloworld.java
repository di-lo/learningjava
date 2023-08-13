public class LearningJava{ //starts with capitals

  static final int MAX_AGE = 100; // naming constant variables
  public static void main(String[] args){ // args (arguments) stores arguments that are given
    sayHi(); // Hello World!
    String sayinghi = returnSayHi("hello world!); // HELLO WORLD!
    multiply(5, 100); // 500
    int multiplying = multiply(4, 5); // 20
  }

  static void sayHi(){ // method // void is used for not returning
    System.out.println("Hello World!");
  }

  static String returnSayHi(String s){
    return s.toUpperCase();
  }

  static void multiply(int a, int b){
    return a * b;
  }

  static int returnMultiply(int a, int b){
    System.out.println(a * b);
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

  static void nestedLoops(){
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        System.out.println(i + ", " + j);
        break; // 0, 0 - 1, 0 - 2, 0 - 3, 0 - 4, 0
      }
    }
  }

  static void openFile(){
    File file = new File("nameofthefile"); // suppose the file's name is "nameofthefile"
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
      System.out.println(scan.nextLine()); // print out all of the file
    }
  }

  static void useSwitch(){ // instead of if/else
    String dog = "pug";

    switch(dog){
      case "pug":
        System.out.println("small dog"); // small dog
        break;
      case "great dane":
        System.out.println("large dog"); // String dog = "great dane";
        break;
      default:
        System.out.println("try a different dog name"); // String dog = "pomeranian";
    }
  }

  static void createList(){
    ArrayList fruitlist = new ArrayList();
    fruitlist.add("Mango");
    fruitlist.add("Strawberry");
    fruitlist.add("Watermelon");
    System.out.println(fruitlist); // [Mango, Strawberry, Watermelon]
  }

  static void tryCatch(){
    Scanner scan = new Scanner(System.in);
    System.out.println("What'S your favorite number?");

    try{
      int usernumber = scan.nextInt(); // 7
      System.out.println(usernumber); // 7
    } catch(Exception e){ // seven
        System.out.println("Sorry, please enter a number:"); // Sorry, please enter a number:
    }
  }

  static void hashMap(){
    HashMap<String, String> passwords = new HashMap<String, String>(); // HashMap<key, value> name = new HashMap<key, value>();
    passwords.put("bobbyjoe" = "FluffyP0nies");
    passwords.put("singlelady" = "AloeVera?");
    passwords.put("coolguy" = "15673");

    System.out.println(passwords); // {bobbyjoe=FluffyP0nies, singlelady=AloeVera?, coolguy=15673}
  }
  
}


