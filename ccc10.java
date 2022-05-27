//happy number
//a number is said to be happy if it leads to 1 after sequence number of steps
//in each step,number replaced by sum of squares f digits
import java.util.*;
class ccc10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		boolean val=true;
		while(val){
			if(!arr.contains(n)){
				arr.add(n);
				int squ=0;
				while(n!=0){
					int rem=n%10;
					squ=squ+(int)Math.pow(rem,2);
					n=n/10;
				}
				n=squ;
				if(squ==1){
					System.out.println("happy");
					val=false;
				}
			}
			else{
				System.out.println("not happy");
				break;
			}
		}
	}
}