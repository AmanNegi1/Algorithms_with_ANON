package java_prctice;
import java.util.*;
public class total_salary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int bs=scan.nextInt();
		char x=scan.next().charAt(0);
		float hra=20*bs/100;
		float da=50*bs/100;
		int allow;
		if(x=='A') {
		 allow=1700;
		}else if(x=='B') {
			allow=1500;
		}else {
			allow=1300;
		}
		int pf=11*bs/100;
		System.out.println("hra "+hra);
		System.out.println("da "+da);
		System.out.println("allow "+allow);
		double totalsalary=bs+hra+da+allow-pf;
		System.out.println(totalsalary*1D);
	}

}
