public class powerQuestion1
{
    public static void calcX(int x,int n,int result){
      
       if(x==0){
        result=0;
        System.out.println(result);
        return;
       }
       if(n==0){
        result=1;
        System.out.println(result);
        return;
       }
       if(n==1){
        result=result*x;
        System.out.println(result);
        return;
       }
        result=result*x;
        calcX(x, n-1,result);
    }
public static void main(String[] args)
{
    int n=4;
    int x=5;
    calcX(x, n,1);
//System.out.print();
}
}
