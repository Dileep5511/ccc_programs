//count and say series
import java.util.*;
class ccc7{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="11";
        for(int i=0;i<n-2;i++){
            int len=str.length();
            int j=0,c=1;
            String series="";
            String out="";
            while(j<len){
                if(j==len-1){
                    out=String.valueOf(c)+String.valueOf(str.charAt(j));
                    series=series+out;
                    if(str.charAt(j-1)==str.charAt(j))
                        break;
                }
                else{
                    if(str.charAt(j)==str.charAt(j+1))
                        c++;
                    else{
                        out=String.valueOf(c)+String.valueOf(str.charAt(j));
                        series=series+out;
                        c=1;
                    }
                }
                j++;
            }
            str=series;
        }
        System.out.println(str);
    }
}