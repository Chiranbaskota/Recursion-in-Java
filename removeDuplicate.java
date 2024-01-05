//wap to remove duplicate character present in the string.
//Time complexity of this code is O(n),where n is the length of the string.
public class removeDuplicate
{
    public static boolean arr[]=new boolean[26];
    public static void removeDup(int index,String str,String newString){
           if(index==str.length()){
            System.out.println(newString);
            return;
           }

        int current=str.charAt(index)-'a';
        if(arr[current]){
            removeDup(index+1,str,newString);
        }
        else{
            newString=newString+str.charAt(index);
            arr[current]=true;
            removeDup(index+1,str,newString);
        }
    }
public static void main(String[] args)
{
     String str="aabcdeabcdeabcde";
     removeDup(0,str,"");
//System.out.print();
}
}