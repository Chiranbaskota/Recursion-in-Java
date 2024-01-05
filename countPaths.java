//Count total paths in maze to move form (0,0) to (n-1,m-1)
public class countPaths
{
    public static int countTotPath(int i,int j,int n,int m){
         if(i==n||j==m){
           return 0;
         }

          if(i==n-1&&j==m-1){
            return 1;
          }

       //move downwards
       int down=countTotPath(i+1,j,n,m);
       //move right
       int right=countTotPath(i, j+1, n, m);

       return down+right;
    }
public static void main(String[] args)
{
    int n=3;
    int m=3;
    int path=countTotPath(0, 0, n, m);
    System.out.println(path);

//System.out.print();
}
}
