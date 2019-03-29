package NumberTheory;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
import java.util.Collections; 
class Qualify {
	
    public static int qualify(int arr[],int k){
    int count=0;
    for(int i=0;i<arr.length;i++){
    if( arr[i]>=arr[k] && i!=k){
    count++;
    }else if(i==k) {
    	if(arr[i-1]==arr[k]) {
    		count++;
    	}
    }
    
    }
    return count;
    }
    public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    int T=Integer.parseInt(input);
    int testy=0;
    int test[]=new int[T];
    while(T!=0){
    int N=s.nextInt();
    int arr[]=new int[N];
    int K=Integer.parseInt(input);
    for(int i=0;i<N;i++){
       arr[i]=Integer.parseInt(input);
    }
    Arrays.sort(arr);
    int t=arr.length-1;
    for(int k=0;k<t;k++) {
    	int temp=arr[t];
    	arr[t]=arr[k];
    	arr[k]=temp;
    	t--;
    }
    
    int c=qualify(arr,K);
    test[testy]=c;
    testy++;
    //System.out.println(c);
    T--;
    }//end of while loop
    for(int i=0;i<test.length;i++) {
    	System.out.println(test[i]);
    }
    }
}