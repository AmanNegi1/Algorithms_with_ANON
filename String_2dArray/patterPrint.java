package String_2dArray;

public class patterPrint {

	public static void printPattern(int arr[][]) {
		int  j=0,c=0;
		int row=arr.length;
		int col=arr[0].length;
		int s=col-2;
		for(int i=1;i<row;i++) {
			c++;
			while(j<=s) {
			System.out.print(arr[i][j]+" ");
			j++;
			}
			if(c==2) {
				j=1;
				s=col;
			}else {
				j=0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= {{2,3,5},{4,4,6},{4,4,1},{5,4,4}};
    
    printPattern(arr);
	}

}
