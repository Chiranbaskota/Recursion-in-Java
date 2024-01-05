//Find the first and last occurence of an element in a string.
//Time complexity of this program is O(n),where n is the length of string.

public class Occurence
{
    public static int firstValue=-1;
    public static int lastValue=-1;
    public static void findOccurence(int index,char element,String str){
        if(index==str.length()){
            System.out.println("The first occurence of "+element+" is at index "+firstValue);
            System.out.println("The last occurence of "+element+" is at index "+lastValue);
            return;
        }
         if(str.charAt(index)==element){
            if(firstValue==-1){
                firstValue=index;
            }
            else{
              lastValue=index;  
            }
         }
         findOccurence(index+1, element, str);
    }
public static void main(String[] args)
{
    String str="bbcadefea";
    findOccurence(0, 'a', str);
//System.out.print();
}
}