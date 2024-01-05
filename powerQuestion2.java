public class powerQuestion2
{
    public static int calcPow(int x,int n){
       if(x==0){
        return 0;
       }
       if(n==0){
        return 1;
       }
       if(n%2==0){
        //for even power
        return calcPow(x,n/2)*calcPow(x,n/2);
       }
       else{
        //for odd power
        return calcPow(x, n/2)*calcPow(x, n/2)*x;
       }
    }
public static void main(String[] args)
{
    int x=5;
    int n=4;
    int value=calcPow(x, n);
    System.out.println(value);
//System.out.print();
}
}
