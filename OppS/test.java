package OppS;

public class test {
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
	     

		 for(int j=0;j<temp1.length;j++) {
		    	output[j] = new int[temp1[j].length+1];
               output[j][0]=input[si];
              for(int i=0;i<temp1[j].length;i++){
		    	output[j][i+1]=temp1[j][i];
              }
       }
        
		 for(int j=0;j<temp2.length;j++) {
		    	output[j+temp1.length] = new int[temp2[j].length];
              
              for(int i=0;i<temp2[j].length;i++){
		    	output[j+temp1.length][i]=temp2[j][i];
              }
       }
		 return output;
	}
	public static void main(String args[]) {
		int arr[]= {2,1,3,2};
		int a[][]=subsetsumk(arr,4,0);
		
	}
}
