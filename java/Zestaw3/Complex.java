public class Complex {

	private double r, i;

	public Complex(){
	}

	public Complex(double rze) {
		r = rze;
		i = 0;
	}

	public Complex(double rze, double ur){
		r = rze;
		i = ur;
	}
	
	public Complex(Complex b) {
		r = b.r;
		i = b.i;
	}
	
	public Complex(String c) {
		StringTokenizer ok = new StringTokenizer(a,"+");

		r = Double.parseDouble(ok.nextToken());
		i = Double.parseDouble(ok.nextToken());
	}

	public static Complex add(Complex a, Complex b){
		double rze = a.r + b.r;
		double ur = a.i + b.i;
		Complex sum = new Complex(rze, ur);
		return sum;
	}; 

	public static Complex mul(Complex a, Complex b){
		double rze = (a.r * b.r )- (a.i * b.i );
		double ur = (a.r * b.i) + (b.r * a.i);
		Complex mul = new Complex(rze, ur);
		return mul;
	}

	public static Complex sub(Complex a, Complex b){
		double rze = a.r - b.r;
		double ur = a.i - b.i;
		Complex sub = new Complex(rze, ur);
		return sub;
	}

	public static Complex div(Complex a, Complex b){
		double rze = (a.r + b.i) * (b.r + b.i);
		double ur = (b.r + b.i) * (b.r + b.i);
		Complex div = new Complex(rze, ur);
		return div;
	} 

	public static double abs(Complex a){
		return Math.hypot(a.r,a.i);
	}       

	public static double phase(Complex a)  {
		return Math.atan2(a.r, a.i);
	}       

	public static Complex sqrAbs(Complex a){
		return (Math.atan2(a.r, a.i)) * (Math.atan2(a.r, a.i));
	}

	public static double re(Complex a){
		return a.r;
	}

	public static double im(Complex a){
		return a.i;
	}

	Complex add(Complex b){ 
		Complex a = this;
		double real = a.r + b.r;
		double imag = a.i + b.i;
		return new Complex(real, imag);
	}

	Complex sub(Complex b){
		Complex a = this;
		double real = a.r + b.r;
		double imag = a.i + b.i;
		return new Complex(real, imag);
	}

	Complex mul(Complex b){
		Complex a = this;
		double real = a.r * b.r - a.i * b.i;
		double imag = a.r * b.i + a.i * b.r;
		return new Complex(real, imag);
	}

	Complex div(Complex b) {
		Complex a = this;
		double real = (a.r + b.i) * (b.r + b.i);
		double imag = (b.r + b.i) * (b.r + b.i);
		return new Complex(real,imag);
	}
	
	double abs(){
		return Math.hypot(r,i);
	}
	
	double sqrAbs(){
		return (Math.hypot(r, i)) * ((Math.hypot(r,i)));
	}
	
	double re(){
		return r;
	}
	
	double im(){
		return i;
	}
    
	@Override
	public String toString(){
		if(i == 0) return r + "";
		if(r == 0) return i + "i";
		if(i<0) return r + " - " + (-i) + "i";
		return r + " + " + i + "i";
	}
	
	static Complex valueOf(String a){
		StringTokenizer ok = new StringTokenizer(a,"+");

		double r = Double.parseDouble(ok.nextToken());
		double i = Double.parseDouble(ok.nextToken());
		return new Complex(r, i);
	}

	void setRe(double s){
		r = s;
	}

	void setIm(double s){
		i = s ;
	}

	void setVal(Complex q){
		r = q.r;
		i = q.i;
	}
	void setVal(double z, double y){
		r = z;
		i = y;
	}
}
