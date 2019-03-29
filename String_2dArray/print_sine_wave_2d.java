package String_2dArray;
import java.util.*;
public class print_sine_wave_2d {
public static void wavePrint(int input[][]){
		int i=0,j=0,t=-1;
		int rl=input.length;
		int cl=input[0].length;
		int c=0;
		while(i<cl) {
			while(j<rl) {
				System.out.print(input[j][i]);
				if(c==0) {
				j++;
					t=j;
				}else {
					t=j;
					if(j==0) {
						
					}else {
						j--;
						t=j;
					}
				}
				if(j==0) {
					c=0;
					j=t;
					System.out.print(input[j][i]);
					break;
				}else if(j==rl-1) {
					System.out.print(input[j][i]);
				    c=1;
				    j=t;
				    break;
				}else {
					j=t;
				}
				

			}
			i++;
		
		}
	}
   public static void main(String []args) {
	   int arr[][]= {{1,2,3,6},{4,2,5,8},{5,6,7,9}};
	   wavePrint(arr);
   }
}
