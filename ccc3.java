//all the elements in the array are repeated but not the one element. find the element
//xor operation for all the elements
import java.util.*;
class ccc3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long result=0;
        for(int i=0;i<n;i++)        
            result=result^arr[i];
        System.out.println(result);
    }
}