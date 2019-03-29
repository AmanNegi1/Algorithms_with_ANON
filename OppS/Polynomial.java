package OppS;

public class Polynomial {
    private int coeff[];
	public Polynomial(){
          coeff=new int [10000];
      }
	public void setCoefficient(int degree,int coeff) {
	this.coeff[degree]=coeff;
	}
	public int degree() {
		int degr=0;
		for(int i=0;i<10000;i++) {
			if(coeff[i]!=0) {
				degr=i;
			}
		}
		return degr;
	}
	public void print() {
		for(int i=0;i<10000;i++) {
			if(coeff[i]!=0) {
				System.out.print(coeff[i] + "x"+ i+ " ");
			}
		}
		System.out.println();
	}
	public int getcoeff(int deg) {
		if(deg>10000) {
			return Integer.MIN_VALUE;
		}
		return coeff[deg];
	}
	public Polynomial add(Polynomial p) {
		Polynomial pr=new Polynomial();
		for(int j=0;j<10000;j++) {
			pr.setCoefficient(j, this.coeff[j]+p.coeff[j]);
		}
		return pr;
	}
	public Polynomial subtract(Polynomial p) {
		Polynomial pr=new Polynomial();
		for(int j=0;j<10000;j++) {
			pr.setCoefficient(j,this.coeff[j]-p.coeff[j]);
		}
		return pr;
	}
	public Polynomial multiply(Polynomial p) {
		Polynomial pr=new Polynomial();
		for(int i=0;i<=this.degree();i++) {
		for(int j=0;j<=this.degree();j++) {
			pr.coeff[i+j]=pr.coeff[i+j]+(this.coeff[i]*p.coeff[j]);
		}}
		return pr;
		
	}
}
