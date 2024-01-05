public class powerQuestion
{
    public static int calcX(int x,int n){
        int result=0;
       if(x==0){
         result=0;
         return result; 
       }
       if(n==0){
        result=1;
        return result;
       }
       result=x*calcX(x,n-1);
       return result;
    }
public static void main(String[] args)
{
    int x=5;
    int n=4;
    int ans=calcX(x,n);
    System.out.println(ans);
//System.out.print();
}
}
