package Recursion;

public class printsumsubsettok {
	public static void subsetsumk(int input[],int k,int si,int output[]){
		if(input.length==si) {
			if(k==0) {
				for(int i=0;i<output.length;i++) {
					System.out.print(output[i]);
				}
			System.out.println();
			}else {
				
			}
			
			return;
		}//end of if block
		int newout[]=new int[output.length+1];
		newout[newout.length-1]=input[si];
	
		for(int i=output.length-1;i>=0;i--) {
			
			newout[i]=output[i];
			//j++;
		}
		subsetsumk(input,k-input[si],si+1,newout);
		subsetsumk(input,k,si+1,output);
		
	     
	   
		
		 
	}
	public static void main(String args[]) {
		int arr[]= {2,1,3,2};
		int output[]= {};
		subsetsumk(arr,4,0,output);
	}
}
