package dynamicProgramming;

import java.util.Scanner;

 class alphaCode_use {
	 
	 public int alphaDp(int arr[],int size,int op[]) {
		 if(size==1||size==0) {
			 
			 return 1;
		 }
		 int ans=0;
		 if(op[size]>0) {
			 return op[size];
		 }
			 ans=alphaDp(arr,size-1,op);
			 if(arr[size-2]*10+arr[size-1]<=26) {
				 ans+=alphaDp(arr,size-2,op);
			 }
		 
		 op[size]=ans;
		 return op[size];
	 }
	 public int alphaCode(int arr[],int size) {
		 if(size==1) {
			 return 1;
		 }
		 if(size==0) {
			 return 1;
		 }
		 int output=alphaCode(arr,size-1);
		 if(arr[size-2]*10+arr[size-1]<=26) {
	     output+=alphaCode(arr,size-2);
		 }
		 return output;
	 }
	  
      

}
public class alpha_Code{
	 int arr[];
	  public alpha_Code(int n,Scanner s) {
		  arr=new int[n];
	      for(int i=0;i<n;i++) {
	    	 arr[i]=s.nextInt();
	      }
	  }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		alpha_Code obj=new alpha_Code(n,s);
		alphaCode_use ob2=new alphaCode_use();
	    //int r=ob2.alphaCode(obj.arr,obj.arr.length);
		int op[]=new int[n+1];
		int r=ob2.alphaDp(obj.arr,obj.arr.length,op);
	    System.out.println(r);
	    
	}
	
}
