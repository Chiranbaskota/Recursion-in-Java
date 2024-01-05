public class subsequence
{
    public static void printSubsequence(int index,String str,String newString ){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
            char c=str.charAt(index);
        //by taking character at index
        printSubsequence(index+1, str, newString+c);

        //by not taking character at index
        printSubsequence(index+1, str, newString);
    }
public static void main(String[] args)
{
    String str="abc";
    printSubsequence(0, str, "");

//System.out.print();
}
}
