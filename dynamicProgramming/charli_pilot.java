package dynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class charli_pilot {

	public static void main(String[] args)throws Exception {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
     Vector<Integer> v1,v2;
     v2=v1=new Vector<Integer>();
     while(n--!=0) {
    	int x=Integer.parseInt(br.readLine());
    	int y=Integer.parseInt(br.readLine());
    	v1.add(x);
    	v2.add(y);
     }
     System.out.println(pilot_Assistant(v1,v2,n-1,0,0,0));
	}
   public static int pilot_Assistant(Vector<Integer> pilot,Vector<Integer> assis,int n,int x,int i,int j) {
	   if(j==pilot.size()|| i==assis.size()) {
		   return 0;
	   }
	   if(x==0) {
		   return assis.get(i)+pilot_Assistant(pilot,assis,n-1,1,i+1,j+1);
	   }else if(x==n) {
		   return pilot.get(j)+pilot_Assistant(pilot,assis,n-1,x-1,i+1,j+1);
	   }else {
		   return Integer.min(assis.get(i)+pilot_Assistant(pilot,assis,n-1,x+1,i+1,j+1), pilot.get(i)+pilot_Assistant(pilot,assis,n-1,x-1,i+1,j+1));
	   }
   }
}
