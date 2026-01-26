import java.util.ArrayList;
import java.util.Scanner;

public class To_do_list{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<> ();
        String repeat="YES";
        while(repeat.equals("YES"))
        {
            System.out.print("\n--- TO-DO-LIST ---");
            System.out.print("\n1.Add Task\n2.Remove Task\n3.View Task\n4.Update Task\n5.Exit\nYour Choice : ");
            int choice = in.nextInt();
            in.nextLine();
            switch(choice){
                case 1: //Adds your Task
                {
                    System.out.print("\nEnter the task to add : ");
                    String str=in.nextLine();
                    str=str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
                    list.add(str);
                    System.out.print("Task Added Successfully.\n");
                    break;
                }
                case 2: //Remove any Task which we want
                {
                    System.out.print("\nEnter the Task no to delete : ");
                    int delete=in.nextInt();
                    in.nextLine();
                    if(delete>0 && delete<=list.size())
                    {
                        System.out.print("Task: "+list.get(delete-1)+" Deleted Successfully.\n");
                        list.remove(delete-1);
                    }
                    else
                    {System.out.print("Nothing to Delete\n");}
                    break;
                }
                case 3: //Prints all the task which are there
                {
                    System.out.print("\nMy Tasks are : ");
                    if(list.isEmpty())
                    {
                        System.out.print("No Task Added Till Now!\n");
                    }
                    else
                    {
                        int j=1;
                        for(String i:list)
                        {
                            System.out.print("\n"+j+"."+i);
                            j++;
                        }
                        System.err.print("\n");
                    }
                    break;
                }
                case 4: //Update any task
                {
                    System.out.print("\nEnter the Task no. to update : ");
                    int update=in.nextInt();
                    in.nextLine();
                    System.out.print("Enter the new Task : ");
                    String str=in.nextLine();
                    str=str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
                    if(update>0 && update<=list.size())
                    {
                        list.set(update-1,str);
                        System.out.print("\nTask Updated Successfully");
                    }
                    else
                    {
                        System.out.print("\nEnter valid Task no. to update");
                    }
                    break;
                }
                case 5: //Exit the program
                {
                    repeat="NO";
                    break;
                }
                default:
                {
                    System.out.print("Enter a Valid Choice!!\n");
                }
            }
        }
        System.out.print("\nExiting...");
    }
}
