public class towerOfHanoi
{
    public static void towerOfHan(int n,String source,String helper,String dest){
        if(n==1){
          System.out.println("1 disc is transfered from "+source+ " to "+dest);
            return;
        }
        towerOfHan(n-1, source, dest, helper);
        System.out.println(n+" disc is transfered from "+source+ " to "+dest);
        towerOfHan(n-1,helper,source,dest);
    }
public static void main(String[] args)
{
    int n=3;
    towerOfHan(n, "S", "H", "D");

//System.out.print();
}
}
