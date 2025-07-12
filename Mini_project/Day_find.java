//Find Day by putting number (Used latest switch case syntax)
package Mini_project;
import java.util.Scanner;

public class Day_find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find the Day : ");
        int day = input.nextInt();
        switch(day){
            case 1 -> System.out.print("The Day is : Monday");
            case 2 -> System.out.print("The Day is : Tuesday");
            case 3 -> System.out.print("The Day is : Wednesday");
            case 4 -> System.out.print("The Day is : Thursday");
            case 5 -> System.out.print("The Day is : Friday");
            case 6 -> System.out.print("The Day is : Saturday");
            case 7 -> System.out.print("The Day is : Sunday");
            default -> System.out.print("Invalid Input!");
        }
    }
}
