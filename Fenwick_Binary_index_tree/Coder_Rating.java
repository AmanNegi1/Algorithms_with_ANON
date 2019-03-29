package Fenwick_Binary_index_tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class CoderComp implements Comparator<Coder>{
	 @Override
		public int compare(Coder obj, Coder obj2) {
			if(obj.x==obj2.x) {
				return obj.y-obj2.y;  
			}
			return obj.x-obj.y;  
		}
} 
class Coder  {
	int x;
	int y;
	int index;
	public Coder(int x,int y,int index) {
		this.x=x;
		this.y=y;
		this.index=index;
	}
 }
public class Coder_Rating {
	static int bit[]=new int[100001];
	public static void update(int y) {
		for (  ; y<=100000 ; y+=y&(-y)) {
		bit[y]++;
		}
	}
	public static int query(int y) {
		int value=0;
		for(;y>0;y-=y&(-y)) {
			value+=bit[y];
		}
		return value;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		//Coder arrC[]=new Coder[n];
		ArrayList<Coder> arr=new ArrayList<Coder>();
		for(int i=0;i<n;i++) {
			int x=Integer.parseInt(br.readLine());
			int y=Integer.parseInt(br.readLine());
			arr.add(new Coder(x,y,i));
		}
		Collections.sort(arr, new CoderComp());
		int ans[]=new int[n];
		for(int i=0;i<n;) {
			int endIndex = i;

			while(endIndex <n && arr.get(endIndex).x == arr.get(i).x && arr.get(endIndex).y == arr.get(i).y){
				endIndex++;
			}
			// query

			for(int j=i;j<endIndex;j++){
				ans[arr.get(j).index] = query(arr.get(j).y);
			}

			for(int j=i;j<endIndex;j++){
				update(arr.get(j).y);
			}

			i = endIndex;
			
			// update
		}

		
		for(int i:ans)
			System.out.println(i);
		//arr.forEach(nn -> System.out.println(nn.x+" "+nn.y+" "+nn.index+" \n")); 
	    
	} 

}
