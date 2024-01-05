//wap to print all the permutations of the string.
//Time complexity of this code is O(n*n!),where n is the length of the string.
public class printPermutations
{
    public static void printPer(String string,String permutation){
        if(string.length()==1){
            permutation=permutation+string;
            System.out.println(permutation);
            return;
        }
        

        for(int i=0;i<string.length();i++){
            char currentChar;
            currentChar=string.charAt(i);
            String newString=string.substring(0, i)+string.substring(i+1);
            printPer(newString,permutation+currentChar);
        }

    }
public static void main(String[] args)
{
    String str="abc";
    printPer(str,"");
//System.out.print();
}
}
