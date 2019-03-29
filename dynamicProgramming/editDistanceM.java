package dynamicProgramming;

public class editDistanceM {

	public static int editDisM(String s,String t,int  store[][]) {
		int m=s.length();
		int n=t.length();
		if(store[m][n]!=-1) {
			return store[m][n];
		}
		if(m==0) {
			store[m][n]=n;
		    return store[m][n];
		}
		if(n==0) {
			store[m][n]=m;
			return store[m][n];
		}
		if(s.charAt(0)==t.charAt(0)) {
			store[m][n]=editDisM(s.substring(1),t.substring(1),store);
		    return store[m][n];
		}else {
			int op1=editDisM(s,t.substring(1),store);
			int op2=editDisM(s.substring(1),t,store);
			int op3=editDisM(s.substring(1),t.substring(1),store);
			store[m][n]=1+Math.min(op1, Math.min(op2, op3));
			return store[m][n];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="ade";
		int store[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length()+1;i++) {
        	for(int j=0;j<t.length()+1;j++) {
        		store[i][j]=-1;
        	}
        }
        int e=editDisM(s,t,store);
	    System.out.println(e);
	}

}
