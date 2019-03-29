package OppS;
import java.util.*;
public class ComplexNumber {
	private int real;
	private int imagine;

	public ComplexNumber(int real,int imagine) {
		this.real=real;
		this.imagine=imagine;
    }
	public void print() {
		System.out.print(real+"+"+imagine+"i");
	}
//	public void setReal(int real) {
//		this.real=real;
//	}
//	public void setImaginary(int imagine) {
//		this.imagine=imagine;
//	}
//	public void simplify(int real,int imagine) {
//		
//	}
	public void add(ComplexNumber c2) {
//	//	System.out.println();
//		System.out.println(this.real);
//		//System.out.println(c2);System.out.println(this);
//		this.real=this.real+c2.real;
//		this.imagine=this.imagine+c2.imagine;
	    //simplify(this.real,this.imagine);
	}
	public void multiply(ComplexNumber c2) {
		System.out.println(this.real);
		int r=this.real;
		
		this.real=(this.real*c2.real)-(this.imagine*c2.imagine);
		System.out.println(this.imagine);
		this.imagine=(this.imagine*c2.real)+(r*c2.imagine);
	}
//	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c3) {
//		int r=c1.real+c3.real;
//		int i=c1.imagine+c3.imagine;
//		ComplexNumber C=new ComplexNumber(r,i);
//		return C;
//	}
}
