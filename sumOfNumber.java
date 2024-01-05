import java.util.*;
public class sumOfNumber
{
    public static void sumofNum(int n,int i,int sum){
       
     if(n==i){
      sum=sum+i;
      System.out.println(sum);
      return;
        }
       
        sum=sum+i;
    sumofNum(n, i+1, sum);
      
        }
        
    

public static void main(String[] args)
{
    int n;
    System.out.println("Enter the number upto which sum is calculated");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     sumofNum(n, 1, 0);
    
     
//System.out.print();
}
}