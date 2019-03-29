package Recursion;

public class return_sum_n_subset {

	public static int[][]subsetsumk(int input[],int k,int si){
		if(input.length==si) {
			if(k==0) {
				int temp[][]=new int[1][0];
				return temp;
			}else {
				int temp[][]=new int[0][0];
				return temp;
			}
		}//end of if block
		int temp1[][]=subsetsumk(input,k-input[si],si+1);
		int temp2[][]=subsetsumk(input,k,si+1);
		int[][] output = new int[temp1.length+temp2.length][];
	     
	   if(temp1.length!=0) {
		   output[0][0]=input[si];   
	   }
		 for(int j=1;j<temp1.length;j++) {
		    	output[j+temp1.length] = new int[temp1[j].length+1];
		    	output[j+temp1.length][0]=input[si];
        }
		
		
		 for(int j=0;j<temp2.length;j++) {
		    	output[j+temp2.length] = new int[temp2[j].length + 1];
		    	output[j+temp1.length][0]=input[k];
     }
		 return output;
	}
	public static void main(String args[]) {
		int arr[]= {2,1,3,2};
		int a[][]=subsetsumk(arr,4,0);
	}
}
