package NumberTheory;
import java.util.*;
public class spreadTheWord {

	public static int spreadTheWord1(int arr[]) {
		int t=arr[0];
		int len=arr.length-1;
		int s=t;
		int dayCount=1,i=1,j=0;
		
		while(s<len) {
			if(t>=len) {
				return dayCount;
			}
			while(i<=t && s<(len-i)) {
				s=s+arr[i];
				i++;
			}
			t=s+i;
			dayCount++;
			len=len-i;
		}
		return dayCount;
	}
	public static void main(String args[]) {
	//	Scanner s=new Scanner(System.in);
		int testCases=0;
		 try (Scanner s = new Scanner(System.in))
	        {
			  testCases=s.nextInt();
	        }
		
		int testArr[]=new int[testCases];
		int t=0;
		while(testCases!=0) {
			int N=0;
			//int i=0;
			try (Scanner s = new Scanner(System.in))
	        {
				 N=s.nextInt();
	        }
			
			int arr[]=new int[N];
			for(int i=0;i<arr.length;i++) {
				try (Scanner s = new Scanner(System.in))
		        {
					arr[i]=s.nextInt();
		        }
				
			}
			int test=spreadTheWord1(arr);
			System.out.println(test);
			//testArr[t]=test;
			//t++;
			testCases--;
		}//end of while loop..
//		for(int i=0;i<testArr.length;i++) {
//			System.out.println(testArr[i]);
//		}
	}
}
