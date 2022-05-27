//find the missing element from the numbers ranging from 1 to n
//all elements occurs once but one element occurs twice.
//one element misses.
import java.util.*;
class ccc5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int arr_xor=0,n_xor=0;
        for(int i=0;i<n;i++)
        {
            arr_xor=arr_xor^arr[i];
            n_xor=n_xor^(i+1);
        }
        int res=arr_xor^n_xor;
        int val=Integer.valueOf(Integer.toBinaryString(res));
        int count=0;
        while(true){
            int rem=val%10;
            val=val/10;
            if(rem==1)
                break;
            count++;
        }
        ArrayList<Integer> same=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=Integer.toBinaryString(arr[i]);
            int value=Integer.valueOf(str);
            int x=count,rem=0;
            while(x>=0)
            {
                rem=value%10;
                value=value/10;
                x--;
            }
            if(rem==1)
                same.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            String str=Integer.toBinaryString(i+1);
            int value=Integer.valueOf(str);
            int x=count,rem=0;
            while(x>=0)
            {
                rem=value%10;
                value=value/10;
                x--;
            }
            if(rem==1)
                same.add(i+1);
        }
        int sum=0;
        for(int i=0;i<same.size();i++)
            sum=sum^same.get(i);
        System.out.println(sum);
    }
}