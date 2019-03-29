package java_prctice;
import java.util.*;
public class int_2part_division {

	public static int main(int[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int i=1,pre=0,cur=0;
		boolean inc=true;
		System.out.println("Enter the value of pre");
		pre=scan.nextInt();
		while(i<=n-1) {
			cur=scan.nextInt();
			if(pre<cur) {
				if(inc==false) {
				inc=true;
				}else {
					System.out.println("false");
				    break;
				}
				
				pre=cur;
				i++;
                }
			else if(pre>cur){
			    if(inc==true) {
			    	inc=false;
			    }
				
				pre=cur;
				i++;
			
			}else {
             System.out.println("false");
			  break;
			}
		}//end of while loop
		return 1;
	}
}
