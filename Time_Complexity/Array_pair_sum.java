package Time_Complexity;

public class Array_pair_sum {

	 public static void merge_sort(int ar[],int sI,int eI) {
			if(sI>=eI) {
				return ;
			}
			int mid=(sI+eI)/2;
			merge_sort(ar,sI,mid);
			merge_sort(ar,mid+1,eI);
			merge(ar,sI,eI);
		}
		public static void merge(int input[],int sI,int eI) {
			int mid=(sI+eI)/2;
			int i=sI;
			int j=mid+1;
			int k=0;
			int ans[]=new int[eI-sI+1];
			while(i<=mid && j<=eI) {
				if(input[i]<input[j]) {
					ans[k]=input[i];
					i++;
					k++;
				}else {
					ans[k]=input[j];
					j++;
					k++;
				}
			}//end of while loop
			while(i<=mid) {
				ans[k]=input[i];
				i++;
				k++;
			}
			while(j<=eI) {
				ans[k]=input[j];
				j++;
				k++;
			}
			for(int p=0;p<ans.length;p++) {
				input[sI+p]=ans[p];
			}
		}
	public static void main(String args[]) {
		int arr[]= {2,2,2,2,2};
		int num=4;
		merge_sort(arr,0,arr.length-1);
		  int i=0,j=arr.length-1;
	    
	      while(i<j){
	        if(arr[i]+arr[j]>num) {
	        	j--;
	        }
	        if(arr[i]+arr[j]<num) {
	        	i++;
	        }
	        if(arr[i]+arr[j]==num) {
	        	int t=i,t1=j,c=1,c1=1;
	        	while(arr[t]==arr[t+1]&& t<=j) {
	        		c++;
	        		t++;
	        	}
              while(arr[t1]==arr[t1-1]&& t1>=i) {
	        		c1++;
                    t1--;	        		
	        	}
              int p=c*c1;
              for(int r=1;r<=p-1;r++) {
            		System.out.println(arr[i]+" "+arr[j]);	  
              }
	        	
	        
	        //	i++;
	        	j--;
	        	
	        }
	      }
	}
}
