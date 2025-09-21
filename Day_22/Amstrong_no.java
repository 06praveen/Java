package Day_4;
public class Amstrong_no {
    public static void main(String[] args){
        int x =153;
        boolean res = Amstrong(x);
        System.out.print(res);
    }
    static boolean Amstrong(int x)
    {
        int value=1,rem=1,digit=0;
        int temp=x,count=0,temp2=x;
        while(temp>0)
        {
            temp /= 10;
            count++;
        }
        while(x>0)
        {
            digit = x%10;
            rem=1;
            for(int i=1;i<=count;i++)
            {
                rem = rem*digit;
            }
            value += rem;
            x /= 10;
        }
        if(value-1==temp2)
        {return true;}
        else
        {return false;}
    }
}
