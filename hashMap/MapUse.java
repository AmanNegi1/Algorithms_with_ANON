package hashMap;

public class MapUse {

	public static void main(String[] args) {
     Map<Integer,Integer> m=new Map<>();
     m.insert(11,1);
     m.insert(12,2);
     m.insert(13, 4);
     System.out.println(m.getValue(13));
     System.out.println(m.deleteKey(12));
	}

}
