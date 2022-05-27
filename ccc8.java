import java.util.*;
class ccc8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int len=str.length();
        int l=len;
        int x=Integer.valueOf(String.valueOf(str.charAt(len-1)));
        int y=Integer.valueOf(String.valueOf(str.charAt(len-2)));
        String s="";
        while(x<y){
            s=s+String.valueOf(x);
            len--;
            x=Integer.valueOf(String.valueOf(str.charAt(len-1)));
            y=Integer.valueOf(String.valueOf(str.charAt(len-2)));
            if(len==2)
                break;
        }
        s=s+String.valueOf(x);
        int p=(int)Math.pow(10,l-len+1);
        n=n/p;
        String val=String.valueOf(n);
        String out=val+s;
        char ch[]=out.toCharArray();
        char temp=ch[len-1];
        ch[len-1]=ch[len-2];
        ch[len-2]=temp;
        if(len==2)
            System.out.println("-1");
        else
            System.out.println(ch);
    }
}
