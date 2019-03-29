import java.util.*;
public class NoBST{
	public static int countBST(int n){
		if(n==1){
			return 1;
		}
		if(n==0){
			return 0;
		}
		int c=0;
		for(int i=1;i<=n;i++){
         c=countBST(i-1)+countBST(i+1);
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=countBST(n);
		System.out.println(b);
	}
}