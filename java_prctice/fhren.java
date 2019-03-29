package java_prctice;
import java.util.*;
public class fhren {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        double cel;
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
      while(x<=y){
        cel=(x-32)*5/9;
        System.out.println(x+"\t"+Math.round(cel));
        x=x+z;
      };

		
	}

}
