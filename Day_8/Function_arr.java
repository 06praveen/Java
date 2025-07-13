package Day_8;
import java.util.Arrays;
import java.util.Scanner;

public class Function_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void change(int[] x){
        x[0]=18;
    }
}
