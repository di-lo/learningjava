public class learningjava {
  
  public static void main(String[] args) {
    // ln stands for line
    // to make all/not comment ( ctl/cmd + / )
    // list of command: /*
    System.out.println("Hello World!"); 
    System.out.print("A");
    System.out.print("B"); //Hello World! //AB
    
    System.out.println("What do you mean \"stinky\""); // What do you mean "stinky"
    System.out.println("This is tab \t!"); // This is tab  !
    System.out.println("This \n is \n multiple \n lines"); //This // is // multiple // lines

    int a = 5;
    int b = 2;
    double d = 3.4; //float
    System.out.println(a); // 5
    System.out.println(a + b); // 7 (you can do math with integers)
    System.out.println(Math.pow(a, b)); // (5^2) 25.0
  }

  public static void main(String[] args) {
    System.out.println("Madlibs!"); 
    String username = "dilarashak";

    System.out.println("My ___ sister accidentally ___ed all over her new ___");

    String adj = "beautiful";
    String verb = "spill";
    String noun = "sneakers";

    System.out.println("My " + adj + " sister accidentally " + verb + "ed all over her new " + noun); //My beautiful sister accidentally spilled all over her new sneakers
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //this code will get input from the user
    System.out.print("Enter your name:") 
    String username = input.nextLine(); //Enter your name: "Dilara" //stored as string
    System.out.print(username); //Dilara
  }

  public static void main(String[] args) {
    int a = 0;
    boolean b = (a == 0); // b = true

    if(b){ // if true
      a = a + 1
      System.out.println(a); //output: 1
      
    } else if(false){
      System.out.println("no output");
      
    } else{
      Sytem.out.println("nothing happens");
    }
    
  }

  public static void main(String[] args) {
    int z = 0;
    while(z < 3){
      System.out.println("z is less than 3:" + z); // z is less than 3: 0 // z is less than 3: 1 // z is less than 3: 2
      z++; 
    }
  }

  public static void main(String[] args) {
    String todolist[] = {"clean", "shower", "study"}
    int numbers[] = {1, 2, 3}

    System.out.println(numbers[0]); // 1
    System.out.println(todolist[1]); // shower
        
    System.out.println(numbers[1]); // 2
    System.out.println(todolist[0]); // clean
    
    System.out.println(numbers[2]); // 3
    System.out.println(todolist[2]); // study
        
  }

  public static void main(String[] args) {
    
    for(int i = 0; i < 3; i++){ // 3 indicates how much we want to print
      System.out.println("Hello"); // Hello x3
    }
    int grades[] = {98, 100, 75}    
    for(int i = 0; i < grades.length; i++){ // grades.length = 3
      System.out.println(grades[i]); // 98 // 100 // 75
    }
    int[][] lotterycard = {{20, 7, 15}, {8, 7, 19}, {7, 13, 47}}    
    for(int i = 0; i < 3; i++){
      for(int j = 0; i < 3; i++){
        System.out.println(lotterycard[i][j]); // 20 - 7 - 15 - 8 - 7 - 19 - 7 - 13 - 47
      }
    }    
    
  }
  
}

// Comparison Opperators
// == equal to
// != not equal to
// < less than
// <= less than or equal to
// > greater than
// >= greater than or equeal to
// || OR
// && AND
  




