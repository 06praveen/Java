package Day_2;
public class If_and_loop {
    public static void main(String[] args){
        int a=10;
        if(a>0)
        {
            System.out.println("Number is Positive");
        }
        else if(a==0)
        {
            System.out.println("Number is Zero!");
        }
        else
        {
            System.out.println("Number is Negative");
        }

        int i =1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        for(int j=6;j<=10;j++)
        {
            System.out.println(j);
        }
    }
}
