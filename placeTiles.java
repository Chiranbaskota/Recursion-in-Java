//wap to find the ways of placing tiles of size 1*m in a floor of size n*m.
public class placeTiles
{
    public static int findWays(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
         //vertical ways
         int verticalWays=findWays(n-m,m);

         //horizontal ways
         int horizontalWays=findWays(n-1,m);

         return verticalWays+horizontalWays;
    }
public static void main(String[] args)
{
     int n=4;
     int m=2;
     System.out.println(findWays(n, m));
//System.out.print();
}
}
