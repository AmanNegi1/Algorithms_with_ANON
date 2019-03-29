package Recursion;

public class find_geomatic_sum {
	public static float find_sum(int kk,float n,float s) {
		if(kk<=0) {
			return s;
		}
		s=s+n;
		
		float ans=(float)find_sum(kk-1,n/2,s);
		return ans;
		
	}
	
	public static void main(String []args) {
	int k=3;
	
	float c=(float)find_sum(k+1,1,0);
	System.out.println(c);
}
}
