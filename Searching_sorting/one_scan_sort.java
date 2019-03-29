package Searching_sorting;

public class one_scan_sort {
	
public static void sort012(int[] arr){
	/* int p=0,r=arr.length-1,c=0;
	for(int i=0;i<arr.length;i++) {
		if(i==r) {
			break;
		}
		if(arr[i]==0) {
			if(i>0) {
				int t=arr[i];
				arr[i]=arr[p];
				arr[p]=t;
			}
			p++;
		}else if(arr[i]==2) {
			if(arr[r]!=2 ) {
				int t=arr[r];
				arr[r]=arr[i];
				if(t==0) {
					int tt=arr[p];
					arr[p]=t;
					if(tt!=2) {
					arr[i]=tt;
					}

     			//	r--;
				}else {
					arr[i]=1;
				}
		}else {
				r--;
			int t=arr[r];
			arr[r]=arr[i];
			if(t==0) {
				int tt=arr[p];
				arr[p]=t;
				if(tt!=2) {
				arr[i]=tt;
				}else {
					c++;
				}
				p++;

			}else {
				c++;
			}
	     	}
		}else {
		c++;
		}
	}*/
	//System.out.println(c+1);
	 int zero=0;
	    int two = arr.length-1;
	      int i=0;
	      while(zero<=two){
	        
	        if(arr[i]==0 && arr[zero]!=0){
	          int temp = arr[i];
	          arr[i] = arr[zero];
	          arr[zero] = temp;
	          zero++;
	          i++;
	        }
	        if(arr[i]==2 && arr[two]!=2){
	          int temp = arr[i];
	          arr[i] = arr[two];
	          arr[two] = temp;
	          i++;
	        }
	        if(arr[i]==0 && arr[zero]==0){
	          zero++;
	        }
	        if(arr[i]==2 && arr[two]==2){
	          two--;
	        }
	      }
	        
	/*int t=0,e=0;
	while(t<arr.length && t<=c) {
		if(arr[t]==2 ||arr[t]==1 && e<=c+1) {
			arr[t]=1;
			e++;
		}
		t++;
	}*/
	for(int elem:arr) {
		System.out.println(elem);
	}
	
	}
	public static void main(String []args) {
		int []arr=new int[] {1,0 ,2 ,1 };
		 sort012(arr);
	//	System.out.println(r);
	}
}
