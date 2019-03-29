package String_2dArray;
import java.util.*;
public class row_or {
public static void main(String []args) {
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
    System.out.println("Enter row or column");
    String st=scan.next();
    int s=0;
    if(st.equals("row")) {
    	System.out.println("Enter row index");
    	int ri=scan.nextInt();
    	 for(int i=ri;i<=ri;i++) {
    	    	for(int j=0;j<m;j++) {
    	    		
    	    		s=s+arr[ri][j];
    	    	}
    	    }
    }else if(st.equals("column")) {
    	System.out.println("Enter row index");
    	int cj=scan.nextInt();
    	 for(int i=0;i<n;i++) {
    	    	for(int j=cj;j<=cj;j++) {
    	    		s=s+arr[i][cj];
    	    	}
    	    }
    }else {
    	//return;
    }
    System.out.println(s);
}
}
