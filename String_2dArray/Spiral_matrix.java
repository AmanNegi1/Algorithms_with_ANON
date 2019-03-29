package String_2dArray;
import java.util.*;
public class Spiral_matrix {
	public static void spiralPrint(int matrix[][]){
		int rl=matrix.length;
		int cl=matrix[0].length;
		//System.out.println(rl+" "+cl);
		int cs=0,ce=cl-1,rs=0,re=rl-1,c=0,c1=0;
		while(c	<rl*cl)//if(rs==cs) {
		{
			for(int i=cs;i<=ce;i++) {
		System.out.print(matrix[rs][i] + " ");
		c++;
		}
		/*c=c+c1;
		c1=0;*/
		rs++;
		//}else if( ce>=re-cs) {//ce>rs &&
		for(int i=rs;i<=re;i++) {
		System.out.print(matrix[i][ce] + " ");
		c++;
		}
		/*c=c+c1;
		c1=0;*/
		ce--;
		//}else if(re==ce+1) {
		for(int i=ce;i>=cs;i--) {
		System.out.print(matrix[re][i] + " ");
		c++;
		}
		//c=c+c1;
		//c1=0;
		re--;
		//}else {
		for(int i=re;i>=rs;i--) {
		System.out.print(matrix[i][cs] + " ");
		c++;
		}
		//c=c+c1;
		cs++;

		}//end of while loop
	}
	public static void main(String []args) {
		   int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		   spiralPrint(arr);
	   }
}
