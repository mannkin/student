import java.util.StringTokenizer;

public class Complex implements Field<Complex> {

	private double r, i;

	public Complex(){
		this.r = 0;
		this.i = 0;
	}

	public Complex(double rze) {
		this.r = rze;
		this.i = 0;
	}

	public Complex(double rze, double ur){
		this.r = rze;
		this.i = ur;
	}
	
	public Complex(Complex b) {
		this.r = b.r;
		this.i = b.i;
	}
	
	public Complex(String str) {
		StringTokenizer ok = new StringTokenizer(str,"+");

		this.r = Double.parseDouble(ok.nextToken());
		this.i = Double.parseDouble(ok.nextToken());
	}

	public Complex add(Complex b){ 
		this.r += b.r;
		this.i += b.i;
		return this;
	}

	public Complex sub(Complex b){
		this.r -= b.r;
		this.i -= b.i;
		return this;
	}

	public Complex mul(Complex b){
		this.r = (this.r * b.r) - (this.i * b.i);
		this.i = (this.r * b.i) + (this.i * b.r);
		return this;
	}

	public Complex div(Complex b) {
		this.r = ((this.r * b.r) + (this.i * b.i))/((b.i * b.i) + (b.r * b.r));
		this.i = ((this.i * b.r) + (this.r * b.i))/((b.r * b.r) + (b.i * b.i));
		return this;
	}

	public double abs(){
		return Math.hypot(r,i);
	}
	
	public double sqrAbs(){
		return (Math.hypot(r, i)) * ((Math.hypot(r,i)));
	}
	
	public double re(){
		return this.r;
	}
	
	public double im(){
		return this.i;
	}

	public static Complex add(Complex a, Complex b){
		double rze = a.r + b.r;
		double ur = a.i + b.i;
		return new Complex(rze, ur);
	}; 

	public static Complex mul(Complex a, Complex b){
		double rze = (a.r * b.r )- (a.i * b.i );
		double ur = (a.r * b.i) + (b.r * a.i);
		return new Complex(rze, ur);
	}

	public static Complex sub(Complex a, Complex b){
		double rze = a.r - b.r;
		double ur = a.i - b.i;
		return new Complex(rze, ur);
	}

	public static Complex div(Complex a, Complex b){
		double rze = (a.r + b.i) * (b.r + b.i);
		double ur = (b.r + b.i) * (b.r + b.i);
		return new Complex(rze, ur);
	} 

	public static double abs(Complex a){
		return Math.sqrt(a.r*a.r + a.i*a.i);
	}       

	public static double phase(Complex a)  {
		return Math.atan2(a.r, a.i);
	}       

	public static double sqrtAbs(Complex a){
		return (a.abs() * a.abs());
	}

	public static double re(Complex a){
		return a.r;
	}

	public static double im(Complex a){
		return a.i;
	}
	
    
	@Override
	public String toString(){
		if(i == 0) return r + "";
		if(r == 0) return i + "i";
		if(i<0) return r + " - " + (-i) + "i";
		return r + " + " + i + "i";
	}
	
	static Complex valueOf(String str){
		StringTokenizer ok = new StringTokenizer(str,"+");

		double r = Double.parseDouble(ok.nextToken());
		double i = Double.parseDouble(ok.nextToken());
		return new Complex(r, i);
	}

	void setRe(double s){
		this.r = s;
	}

	void setIm(double s){
		this.i = s ;
	}

	void setVal(Complex q){
		this.r = q.r;
		this.i = q.i;
	}

	void setVal(double z, double y){
		this.r = z;
		this.i = y;
	}
}
