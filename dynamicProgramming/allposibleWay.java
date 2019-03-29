package dynamicProgramming;
import java.util.Scanner;
public class allposibleWay {
	public static int AllPossible(int a,int b,int num) {
		int x=a-(int)Math.pow(num, b);
		if(x==0) {
			return 1;
		}
		if(x<0) {
			return 0;
		}
		return AllPossible(x,b,num+1)+AllPossible(a,b,num+1);
	}
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println(AllPossible(a,b,1));
	}
	}
	