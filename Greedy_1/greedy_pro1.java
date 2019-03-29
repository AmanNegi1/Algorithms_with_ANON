package Greedy_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//interface mylam{
//	public int  minDiff(Integer arr[]);
//}
public class greedy_pro1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			ar.add(s.nextInt());
		}
		int min=Integer.MAX_VALUE;
		Collections.sort(ar);
		System.out.println(ar);
		for(int i=1;i<n;i++) {
			if(min>(int) Math.abs(ar.get(i)-ar.get(i-1))) {
				min=(int) Math.abs(ar.get(i)-ar.get(i-1));
			}
		}
		System.out.println(min);
		
	}

}
