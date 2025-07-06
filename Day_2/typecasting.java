package Day_2;
public class typecasting{
    public static void main(String[] args) {
        byte a = 50;
        short b = 250;
        char c = 'a';
        int d = 25000;
        float e = 87.83f;
        double f = 3.14162;
        double result = (a * b) + (d/c) - (e/f);
        System.out.println((a*b) + "\n" + (d/c) + "\n" + (e/f));
        System.out.println("Result is : " + result);
    }
}
// Here all type of data type is converted into double for result
