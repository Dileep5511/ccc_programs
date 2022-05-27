//segregate the elements 0's 1's 2's
//no sorting
//no extra space
//dutch national flag alg
import java.util.*;
class ccc2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(a[mid]==0)//swap of low and mid
            {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else if(a[mid]==2)//swap of mid and high
            {
                int temp=a[high];
                a[high]=a[mid];
                a[mid]=temp;
                high--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}