package java_prctice;
import java.util.*;
public class power_of_no {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int f=1;
    int n=s.nextInt();
    for(int i=0;i<n;i++) {
    	f=f*x;
    }
    System.out.println(f);
	}

}
