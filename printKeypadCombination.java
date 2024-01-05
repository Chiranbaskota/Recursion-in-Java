//wap to print keypad combination

public class  printKeypadCombination 
{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vx","yz"};
    public static void printCom(String str,int index,String Combination){
        if(index==str.length()){
            System.out.println(Combination);
            return;
        }

        char character=str.charAt(index);
        String string=keypad[character-'0'];
        for(int i=0;i<string.length();i++){
            printCom(str,index+1,Combination+string.charAt(i));
        }
    }
public static void main(String[] args)
{
   String str = "23";
   printCom(str,0,"");
//System.out.print();
}
}