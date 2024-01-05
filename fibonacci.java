public class fibonacci
{
    public static void printFab(int a,int b,int n){
       int c;
        if(n==0){
            return;
        }
        c=a+b;
        System.out.print(c+" ");
        printFab(b,c,n-1);
        
    }
public static void main(String[] args)
{
    int a=0;
    int b=1;
    System.out.print(a+" ");
    System.out.println(b+" ");
    int n=7;
    printFab(a,b,n-2);
    


//System.out.print();
}
}
