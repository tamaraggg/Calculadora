package calc;

public class Operacion {
	private int a;
	private int b;

	public Operacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operacion(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int suma() {
		return this.a + this.b;
	}

	public int resta() {
		return this.a - this.b;
	}

	public int multiplicacion() {
		return this.a * this.b;
	}

	public int divison() {
		return this.a / this.b;
	}
	
	public double potencia() {
		return Math.pow(this.a, this.b);
	}
}
