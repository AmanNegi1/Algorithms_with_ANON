package Searching_sorting;

public class add_two_array {
public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
	 int len=0,c=0,l=0;	
	if(arr1.length>=arr2.length) {
			len=arr1.length;
		}else {
			len=arr2.length;
		}
	
//	if(arr1.length<=arr2.length) {
//		 l=len-arr1.length;
//	}else {
//		 l=len-arr2.length;
//	}
	int arr[]=new int[len+1];

	int j=arr2.length-1,k=len,p=arr1.length-1;
	int r=0;
	int i=len;
	while(i>=0) {
            if(p-1!=-1&& j-1!=-1) {
            	r=arr1[p]+arr2[j]+c;
            	p--;
            	j--;
            }else if(p-1==-1) {
            	r=0+arr2[j]+c;
            	//p--;
            }else if (j-1==-1) {
            	r=arr1[p]+0+c;
            	//j--;
            }
		    int n=r%10;
			r=r/10;
			arr[k]=n;
			c=r;
	//		p--;
			k--;
			i--;
	}
	return arr;
	}
public static void main(String []args) {
	int []arr1=new int[] {1 ,2 ,4,1};
	int []arr2=new int[] {7 ,5 ,6};
	int ar[]=sumOfTwoArrays(arr1,arr2);
	for(int elm:ar) {
		System.out.print(elm);
	}
//	System.out.println(r);
	
}
}
