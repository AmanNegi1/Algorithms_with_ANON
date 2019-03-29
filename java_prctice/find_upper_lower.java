package java_prctice;
import java.util.*;
public class find_upper_lower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i=(int)c;
		
		if(i>=65&&i<=96) {
			System.out.println(1);
		}else if(i>=97&&i<123){
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		
	}

}
