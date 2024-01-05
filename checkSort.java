//wap to check wheather the array is strictly increasing sorted or not.
//Time complexity of this program is O(n),where n is the length of the string.
public class checkSort
{
    public static boolean isSort(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
            
        }
        else{
            return isSort(arr,index+1);
        }
    }
public static void main(String[] args)
{
    int arr[]={1,2,3,4,5};
    boolean dine=isSort(arr,  0);
    System.out.println(dine);

//System.out.print();
}
}
