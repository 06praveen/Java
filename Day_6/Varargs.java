package Day_6;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        varargs(10,18,7,45);            //Value is passed
    }

    static void varargs(int ...v){          //It can be any Datatype(By using this we can give values according to us)
        System.out.println(Arrays.toString(v));
    }
}

