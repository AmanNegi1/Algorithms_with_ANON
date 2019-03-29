package OppS;
import java.util.*;
public class ComplexNumberUse {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(4, 5);
	//	c1.print();
		//System.out.println();
		
		//c1.setReal(10);
	//	c1.setImaginary(30);
	//	c1.print();
		//System.out.println();
		
		ComplexNumber c2 = new ComplexNumber(1,2);
		c1.add(c2);
		//c1.print();
	//	System.out.println();
	//	c2.print();
		System.out.println();
		
		//ComplexNumber c3 = new ComplexNumber(3,2);
		c1.multiply(c2);
		c1.print();
//		
	//	c2.print();
		
//		ComplexNumber c4 = ComplexNumber.add(c1, c3);
//		c1.print();
//		System.out.println();
//		c3.print();
//		c4.print();
	
//		ComplexNumber c5 = c1.conjugate();
//		c5.print();
	}
}
