package String_2dArray;
import java.util.*;
public class max_sum_2d_array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the no of rows");
	    int n=scan.nextInt();
	    System.out.println("Enter the no of column");
	    int m=scan.nextInt();
	    int arr[][]=new int[n][m];
	    System.out.println("Enter Your 2D array");
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<m;j++) {
	    		arr[i][j]=scan.nextInt();
	    	}
	    }
	    int rs=0,i,j,cs=0,max=0,t=-1;
	    for( i=0;i<n ||i<m;i++) {
	    	for( j=0;j<m ||j<n;j++) {
	    		rs=rs+arr[i][j];
	    		cs=cs+arr[j][i];
	    	}
	    	if(rs>=cs) {
	    		if(rs>=max) {
	    			max=rs;
	    			t=1;
	    		}
	    	}else {
	    		if(cs>=max) {
	    			max=cs;
	    			t=2;
	    		}
	    	}
	    	rs=0;
	    	cs=0;
	    }
	    if(t==1) {
	    	System.out.println("row "+t+" "+max);	
	    }else{
	    	System.out.println("column "+t+" "+max);	
	    }
	    
	}

}
