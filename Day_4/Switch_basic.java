package Day_4;
import java.util.Scanner;

public class Switch_basic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of Fruit : ");
        String fruits = input.next().trim().toLowerCase();
        
        switch(fruits)    //We can alsouse new switch case syntax
        {
            case "mango":
            System.out.println("You are Sweet as Mango😙");  //case "mango"->System.out.println("You are Sweet as Mango😙");
            break;                                           //By using the new syntax we dont need to add break
            case "banana":
            System.out.println("You have stregth like Banana🫡");
            break;
            case "apple":
            System.out.println("You are Healthy as a Apple🦾");
            break;
            case "orange":
            System.out.println("You have a face like orange🥲");
            break;
            case "grapes":
            System.out.println("You are long Friend circle🤝");
            break;
            default:
            System.out.println("Please Enter common Fruits🤖!");
        }
    }
}
