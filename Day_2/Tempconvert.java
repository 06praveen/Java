package Day_2;
import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the temp in °C : ");
     float tempC = input.nextFloat();
     float tempF = (tempC * (9/5)) + 32;
     System.out.println("The Temp " + tempC + "°C = " + tempF + "°F");
    }
}
