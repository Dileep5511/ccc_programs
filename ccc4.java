//each element in an array repeated thrice but not one element.
//find the element.
//binary conversion
//binary number digits at place values are counted at each position
//for each position count is mod by 3
import java.util.*;
class ccc4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] c=new int[4];
        for(int i=0;i<4;i++)
            c[i]=0;
        for(int i=0;i<n;i++){
            String str=Integer.toBinaryString(arr[i]);
            int val=Integer.valueOf(str);
            int x=0;
            while(val!=0)
            {
                c[x]=c[x]+val%10;
                val=val/10;
                x++;
            }
        }
        int sum=0;
        for(int i=0;i<4;i++)
            if(c[i]%3!=0)
                sum=sum+(int)Math.pow(2,i);
        System.out.println(sum);
    }
}