package Day_12;

public class Quick_revise_3 {
    public static void main(String[] args){
        Overloading_function("Hello, How are you?");
        Overloading_function(18);
        Overloading_function(7,18);
    }

    static void Overloading_function(String a){
        System.out.print("The String. is : "+a);
    }

    static void Overloading_function(int x){
        System.out.print("\nThe No. is : "+x);
    }

    static void Overloading_function(int x,int y){
        System.out.print("\nThe No. is : "+x+" and "+y);
    }

}
