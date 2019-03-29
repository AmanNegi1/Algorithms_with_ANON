package Recursion;

public class count_zeros {

	public static int count_zero(int x,int c) {
		if(x<=0) {
			return c;
			
		}
		int r=x%10;
		if(r==0) {
			c++;
		}
		int ans=count_zero(x/10,c);
		return ans;
	}
	public static void main(String []args) {
		int m=20320300;
		int r=count_zero(m,0);
		System.out.println(r);
	}
}
