//Find the duplicate number in 1 to n
//tortoise-hare problem
//warshall floyds cycle dectection alg
import java.util.*;
import java.io.*;
class ccc1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n+1;i++)
            arr[i]=sc.nextInt();
        int x=arr[0],y=arr[0];//intially tortosie and hare starting point.
        while(true)
        {
            x=arr[x];//tortoise single jump
            y=arr[arr[y]];//hare double jump
            if(x==y)//tortosie and hare meeting point
            {
                y=arr[0];//hare or tortoise pos set to intitial
                break;
            }
        }
        while(x!=y)
        {
            x=arr[x];//tortoise single jump
            y=arr[y];//hare single jump
        }
        if(x==y)
            System.out.println("duplicate element is : "+x);
        else
            System.out.println("no dublicates");
    }
}