package dynamicProgramming;

public class editDistanceDP {

	public static int editDisDp(String s,String t) {
		int m=s.length();
		int n=t.length();
		int store[][]=new int[m+1][n+1];
		for(int i=0;i<=n;i++) {
			store[0][i]=i;
		}
		for(int j=0;j<=	m;j++) {
			store[j][0]=j;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					store[i][j]=store[i-1][j-1];
				}else {
					store[i][j]=1+Math.min(store[m][n-1],Math.min(store[m-1][n], store[m-1][n-1]));
				}
				
			}
		}
		return store[m][n];
	}
	public static void main(String args[]) {
		String s="abc";
		String t="dc";
		System.out.println(editDisDp(s,t));
	}
}
