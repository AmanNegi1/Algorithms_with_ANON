package NumberTheory;

public class fiboSum {
	
	public static void main(String args[]) {
		long n=35,m=40;
			long temp1=getFibSum(n,m+2);
			long temp2=getFibSum(m,n+1);
			System.out.println(""+(temp1-temp2));
	}
	public static void getpower(long mat[][],long num) {
		if(num==1) {
			return;
		}
		getpower(mat,num/2);
		multiply(mat,mat);
		if(num%2!=0) {
			long m[][]= {{1,1},{1,0}};
			multiply(m,mat);
		}
		
	}
	private static void multiply(long[][] mat, long[][] m) {
		long m1[][]=new long[2][2];
		int mod=100000007;
		m1[0][0]=((mat[0][0]*m[0][0])%mod+(mat[0][1]*m[1][0])%mod)%mod;
		m1[0][1]=((mat[0][0]*m[0][1])%mod+(mat[0][1]*m[1][1])%mod)%mod;
		m1[1][0]=((mat[1][0]*m[0][0])%mod+(mat[1][1]*m[1][0])%mod)%mod;
		m1[1][1]=((mat[1][0]*m[0][1])%mod+(mat[1][1]*m[1][1])%mod)%mod;
		m[0][0]=m1[0][0];
		m[0][1]=m1[0][1];
		m[1][0]=m1[1][0];
		m[1][1]=m1[1][1];
	}
    public static long getFibSum(long m,long l) {
    	long mat[][]= {{1,1},{1,0}};
    	getpower(mat,l-1);
    	return mat[0][0];
    	
    }
}
