package Recursion;

public class array_subset {

	public static int[][] subsets(int a[]){
		
		return subset(a,0);
	}
	/*
	 //second method of soloving this problem 
	 public static int[][] subsetsHelper(int[] input, int startIndex){
		if(startIndex == input.length){
			int[][] output = new int[1][0];
			return output;
		}
		int[][] smallerOutput = subsetsHelper(input, startIndex + 1);
		int[][] output = new int[2*smallerOutput.length][];

		int k = 0;
		for(int i = 0; i < smallerOutput.length; i++){
			output[k] = new int[smallerOutput[i].length];
			for(int j = 0; j<smallerOutput[i].length; j++){
				output[k][j] = smallerOutput[i][j];
			}
			k++;
		}
		for(int i = 0; i < smallerOutput.length; i++){
			output[k] = new int[smallerOutput[i].length+1];
			output[k][0] = input[startIndex];
			for(int j = 1; j <= smallerOutput[i].length; j++){
				output[k][j] = smallerOutput[i][j-1];
			}
			k++;
		}
		return output;
	}
	
	 */
	public static int[][] subset(int input[],int n){
		
		if(n == input.length){
		      int[][] temp = new int[1][0]; ///when first element is null
		      return temp;
		    }
		    //taking small ans
		
		    int[][] smallAns = subset(input, n+1);//calling recursion
		     
  		    int[][] output = new int[2*smallAns.length][];//if u have seen the hint video u will know that after every recursion size of new ans  rowshould be double
  		  System.out.println("n= "+n);
  		    for(int i=0;i<smallAns.length;i++) {
				 output[i]=smallAns[i];
      		}
		    for(int j=0;j<smallAns.length;j++) {
		    	output[j+smallAns.length] = new int[smallAns[j].length + 1];
		    	output[j+smallAns.length][0]=input[n];
           }
		 
   
   for(int i = 0; i<smallAns.length; i++){
      for(int j = 0; j<output[i].length; j++){
       output[i+smallAns.length][j+1] = smallAns[i][j];
        }
      }
		    return output;
	}
	
	public static void main(String []args) {
	 int arr[]= {1,2,3};
	
	
	 int a[][]=subsets(arr);
	 for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a[i].length;j++) {
			   System.out.print(a[i][j]);
		   }
		   System.out.println();
	   }
	}
}
