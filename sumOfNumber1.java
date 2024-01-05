public class sumOfNumber1
{
    public static int sumOfNum(int n){
       
        int sum=0;
        if(n==0){
            return sum;
        }
        sum=n+sumOfNum(n-1);
        return sum;
    }
public static void main(String[] args)
{
   int n=5;
   int value=sumOfNum(n);
   System.out.println(value);
//System.out.print();
}
}
