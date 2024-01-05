public class factorial
{
    public static int calFactorial(int n){
        int fact;
        if(n==0|| n==1){
            fact=1;
         return fact;
        }
        fact=n*calFactorial(n-1);
        return fact;
    }
public static void main(String[] args)
{
int n=5;
int value=calFactorial(n);
System.out.println(value);
//System.out.print();
}
}
