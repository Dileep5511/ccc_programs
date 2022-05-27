//merge 2 sorted arrays using gap method
import java.util.*;
class ccc6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n+m];
        for(int i=0;i<(n+m);i++)
            a[i]=sc.nextInt();
        int gap=((m+n)/2)+((m+n)%2);
        while(gap>0)
        {
           int i=0;
           for(int j=gap;j<(n+m);j++)
           {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                i++;
            }
            if(gap==1)
                break;
            gap=(gap/2)+(gap%2);
        }
        for(int i=0;i<m+n;i++)
            System.out.println(a[i]);
    }
}