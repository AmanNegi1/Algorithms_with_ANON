package Recursion;

public class merge_sort_copy{
public  void sort(int[] in){
    if(in.length <2) return; //do not need to sort
    int mid = in.length/2;
    int left[] = new int[mid];
    int right[] = new int[in.length-mid];
    for(int i=0; i<mid; i++){ //copy left
        left[i] = in[i];
    }
    for(int i=0; i<in.length-mid; i++){ //copy right
        right[i] = in[mid+i];
    }
    sort(left);
    sort(right);
   
    merge(left, right, in);
}

private  void merge(int[] a, int[] b, int[] all){
    int i=0, j=0, k=0;
    while(i<a.length && j<b.length){ //merge back
        if(a[i] < b[j]){
            all[k] = a[i];
            i++;
        }else{
            all[k] = b[j];
            j++;
        }
        k++;
    }
    while(i<a.length){ //left remaining
        all[k++] = a[i++];
    }
    while(j<b.length){ //right remaining
        all[k++] = b[j++];
    }
}

public static void main(String[] args){
    int[] a = {3,1,7,9,3,0,5};
    merge_sort_copy obj=new merge_sort_copy();
    obj.sort(a);    
    for(int j=0; j<a.length; j++){
        System.out.print(a[j] + " ");
    }   
 }
}