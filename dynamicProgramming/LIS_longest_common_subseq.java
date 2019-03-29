package dynamicProgramming;
import FastScanner.FastReader;

public class LIS_longest_common_subseq {

	public static void main(String[] args) {
		FastReader fs=new FastReader();
		int n=fs.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=fs.nextInt();
		}
		int out[]=LIS(arr);
		System.out.println(out);
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]+" ");
		}
		
	}

	static int[] LIS(int[] arr) {
		int output[]=new int[arr.length];
		output[0]=1;
		
		int n=arr.length;
		for (int i = 1; i < n; i++) {
			output[i] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					continue;
				}
				int possibleAns = output[j] + 1;
				if (possibleAns > output[i]) {
					output[i] = possibleAns;
				}
			}
		}
		int best = 0;
		for (int i = 0; i < arr.length; i++) {
			if (best < output[i]) {
				best = output[i];
			}
		}
		return output;
	}

}
