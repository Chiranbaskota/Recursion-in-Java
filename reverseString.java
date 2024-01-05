//wap to reverse the string using recursion.
//The time complexity of this code is O(n),where n is the length of the string.
public class reverseString
{
    public static void reverseStr(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseStr(str,index-1);
        
    }
public static void main(String[] args)
{
   String str="abcd";
   int index=str.length()-1;
   reverseStr(str,index);
//System.out.print();
}
}
