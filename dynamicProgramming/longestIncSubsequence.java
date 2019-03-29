package dynamicProgramming;

public class longestIncSubsequence {

	public static int LIS(int arr[],int i) {
		if(i>=arr.length) {
			return 0;
		}
		int c=1;
		for(int j=i;j>=0;j--) {
			if(j!=0 && arr[j]>arr[j-1] && arr[j]<=arr[i]) {
				c++;
			}
		}
		int ans= LIS(arr,i+1);
		return Math.max(ans, c);
	}
	public static void main(String[] args) {
     int arr[]= {1 ,10 ,1 ,1,1, 5,6,7};
     System.out.println(LIS(arr,0));
	}

}
