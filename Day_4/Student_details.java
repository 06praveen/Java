//In this program i have created students details using nested switch function
package Day_4;
import java.util.Scanner;

public class Students_detail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Department(CS/IT/AIDS) : ");
        String department = input.next().trim().toUpperCase();
        System.out.print("Enter the Roll No.(1-5) : ");
        int roll_no = input.nextInt();

        switch(department)
        {
            case "CS" :
            {
                switch(roll_no)
                {
                    case 1 -> System.out.print("Student Name : Pratham");
                    case 2 -> System.out.print("Student Name : Ankit");
                    case 3 -> System.out.print("Student Name : Dishita");
                    case 4 -> System.out.print("Student Name : Praveen");
                    case 5 -> System.out.print("Student Name : Ronak");
                    default -> System.out.print("Invalid Input!");
                }break;
            }
            case "IT" :
            {
                switch(roll_no)
                {
                    case 1 -> System.out.print("Student Name : Pranav");
                    case 2 -> System.out.print("Student Name : Aniket");
                    case 3 -> System.out.print("Student Name : Aman");
                    case 4 -> System.out.print("Student Name : Shrushti");
                    case 5 -> System.out.print("Student Name : Ayush");
                    default -> System.out.print("Invalid Input!");
                }break;
            }
            case "AIDS" :
            {
                switch(roll_no)
                {
                    case 1 -> System.out.print("Student Name : Aryaveer");
                    case 2 -> System.out.print("Student Name : Naman");
                    case 3 -> System.out.print("Student Name : Vanshita");
                    case 4 -> System.out.print("Student Name : Ram");
                    case 5 -> System.out.print("Student Name : Nilesh");
                    default -> System.out.print("Invalid Input!");
                }break;
            }
            default: System.out.print("Invalid Input!");
        }
    }
}
