import java.util.Scanner;
public class FehToCel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int f=s.nextInt();
		float cel=5/9* (f-32);
		System.out.println(cel);
	}

}
