package Recursion;

public class StairCase {
    public static int Stair_case(int n) {
    	if (n == 1 || n == 0) 
            return 1;
        else if (n == 2) 
            return 2;
          else
            return Stair_case(n - 3) + Stair_case(n - 2) +Stair_case(n - 1);    
    	
    }
	public static void main(String args[]) {
		int n=8;
		int r=Stair_case(n);
	    System.out.println(r);
	}
}
// n=4;
// 1 1 1 1
// 1 2 1
// 1 1 2
// 2 2
// 1 3
// 3 1
// 	