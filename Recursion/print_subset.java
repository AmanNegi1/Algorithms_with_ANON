package Recursion;

public class print_subset {

	public static void print_subsets(int arr[],int c,int output[]) {
		if(c==arr.length) {
			   for(int i=0;i<output.length;i++) {
				   if(output[i]!=0) {
					   System.out.print(output[i]+" ");
				   }else {
					   
				   }
				  
			   }
	          System.out.println();
			   return;
			}//end of if
			int newout[]=new int[output.length+1];
			newout[newout.length-1]=arr[c];
		//    int j=0;
			for(int i=output.length-1;i>=0;i--) {
				
				newout[i]=output[i];
				//j++;
			}
//			 for(int j=1;j<output.length;j++) {
//				//	newout[j+output.length] = new int[output.length + 1];
//					newout[j+output.length]=arr[c];
//			            }
		//	print_subsets(arr,c+1,output);
			print_subsets(arr,c+1,newout);
			
	}
	public static void main(String args[]) {
		int arr[]= {15,20,12,6};
	//System.out.print(arr.length);
		int output[]= {};
		print_subsets(arr,0,output);
	}
}
