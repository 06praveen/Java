package Day_6;

public class Shadowing{
static int x = 18;     //Scope have in whole program 
  public static void main(String[] args){
    System.out.println("The value of x(Scope:Whole Program) = "+x);   //x=18
    int x = 7;     //Scope only main function (Shadowed the x here)
    System.out.println("The value of x(Scope:main) = "+x);       //x=7
    System.out.println("The value of x(Scope:scope function) = "+scope());    //x=45

  }

  static int scope(){
    int x = 45;       //Scope only in scope function
    return x;
  }
}
