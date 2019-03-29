package Stack;

public class check_Expresion_use {

	public static void main(String[] args) {
		check_brakets_expresion <String>s=new check_brakets_expresion<String>();
		String s1="}}}}";
		//System.out.println(s1.length());
		boolean b=s.check_expresion(s1);
		System.out.println(b);
		s.print();
	}

}
