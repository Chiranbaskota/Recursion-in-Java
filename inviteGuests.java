//Wap to find the number of ways in which you can invite n people to your party, single or in pairs.

public class inviteGuests
{
  public static int totWays(int n){
      if(n<=1){
        return 1;
      }

    //single guests
    int oneWays=totWays(n-1);

    //pairs guests
    int twoWays=(n-1)*totWays(n-2);
    return oneWays+twoWays;

  }

public static void main(String[] args)
{
    int n=4;
   System.out.println(totWays(n));
//System.out.print();
}
}
