package java_prctice;

import java.util.Scanner;

public class Timenow {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int i=1,pre=0,cur=0;
		boolean dec=true;
		System.out.println("Enter the value of pre");
		pre=scan.nextInt();
		while(i<=n-1) {
			cur=scan.nextInt();
             if(pre<cur){
//            	 if(dec==false) {
//            		 System.out.println("false");
//            		 break;
//            	 }
            	 dec=false;
            	 pre=cur;
            	 i++;
            	 
		}else if(pre>cur){
			if(dec==false) {
				System.out.println("false");
				break;
			}
			dec=true;
			pre=cur;
			i++;
		//	dec=false;
			
		}
		else {
             System.out.println("false");
			  break;
			}
		}//end of while loop
		if(dec==true) {
			System.out.print("true");
		}
	//	System.out.println("true");
	//	return true;
	}
}
