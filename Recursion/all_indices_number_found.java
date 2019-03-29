package Recursion;
public class all_indices_number_found {
    public static int[] allIndices(int input[],int x,int startIndex,int i,int arr2[]) {
    	//int arr2[]=new int[input.length-1];
    	//int arr2[]=new int[input.length-1];
    	if(startIndex==input.length-1) {
    		if(input[startIndex]==x) {
    		arr2[i]=startIndex;
    		int arr3[]=new int [i];
       for(int j=0;j<i;j++){
         arr3[j]=arr2[j];
       }    return arr3;
    		}else {
    			return arr2;
    		}
       }//end of if statement
    	if(input[startIndex]==x) {
    		arr2[i]=startIndex;
    		i++;
    	}
      allIndices(input,x,startIndex+1,i,arr2);
    return arr2;
    }
	public static void main(String []args) {
	int arr[]= {8, 8 ,8, 8 ,8};
	int arr1[]=new int[arr.length];
	int n=8;
	int r[]=allIndices(arr,n,0,0,arr1);
	
	int u=0;
	int ar[]=new int[u]; ;
	for(int k=0;k<r.length;k++) {
		if(r[k]==0) {
			if(r[k]==0) {
				u++;
				ar=new int[u];
			}
			}else {
				u++;
				ar=new int[u];
			}
	}
	//System.out.println(ar.length);
	for(int i=0;i<ar.length;i++) { 
	ar[i]=r[i];
	}
	for(int i=0;i<ar.length;i++) {
	   System.out.println(ar[i]);
		}
}}
