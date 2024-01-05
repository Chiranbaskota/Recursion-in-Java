//wap to move all x in the string to last
//Time complexity of this program is O(n),where n is the length of the string.
public class moveXtoLast

{
    public static int count=0;
    public static void moveX(String str,int index,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString=newString+'x';
                
            }
            System.out.println(newString);
                return;
        }
        if(str.charAt(index)=='x'){
            count++;
            moveX(str,index+1,newString);
        }
        else{
            newString =newString+str.charAt(index);
            moveX(str,index+1,newString);
        }
    }
public static void main(String[] args)
{
    String str="aabbxxxabxabx";
    moveX(str,0,"");
//System.out.print();
}
}
