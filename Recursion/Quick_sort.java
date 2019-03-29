package Recursion;

public class Quick_sort {

	public static int position(int s,int e,int in[]) {
		int n=in[s];
		int c=0;
		for(int i=s+1;i  <= e;i++) {
			if(in[i]<n) {
				c++;
			}
		}
		int pivotpos = s+c;//int temp=in[c];
		in[s] = in[s+c];//in[c]=n;
		in[s+c] = n;//in[s]=temp;
         int p = s;
		int q=e;
    
    while(p<pivotpos &&q>pivotpos){
      if(in[p]<n){
        p++;
      }
      else if(in[q]>=n){
        q--;
      }
      else{
        int t=in[q];
				in[q]=in[p];
				in[p]=t;
        p++;q--;
      }
    }
		
		return pivotpos;
	}
  public static void quick_sort(int input[],int start,int end) {
		if(start>=end) {
			return ;
		}
		
		int pi=position(start,end,input);
	    quick_sort(input,start,pi-1);
	    quick_sort(input,pi+1,end);
	}
	public static void quickSort(int[] input) {
		quick_sort(input,0,input.length-1);
	}
	

	public static void main(String []args) {
		int a[]= {6,2,20,8,15,3,4};
		quick_sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
}
