package uppfölj12;

public class ComplexValue {
	private double real, imag;

	public ComplexValue() {
		this(0, 0);
	}

	public ComplexValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public ComplexValue add(ComplexValue v) {
		return new ComplexValue(v.real + this.real, v.imag + this.imag);
	}

	public ComplexValue sub(ComplexValue v) {
		return new ComplexValue(v.real - this.real, v.imag - this.imag);
	}

	public ComplexValue mul(ComplexValue v) {
		double resreal, resimag;
		resreal = this.real * v.real - this.imag * v.imag;
		resimag = this.imag * v.real + this.real * v.imag;
		return new ComplexValue(resreal, resimag);
	}

	public ComplexValue div(ComplexValue v) {
		double resreal, resimag;
		resreal = (this.real * v.real - this.imag * v.imag) / (v.real * v.real + v.imag * v.imag);
		resimag = (this.imag * v.real - this.real * v.imag) / (v.real * v.real + v.imag * v.imag);
		return new ComplexValue(resreal,resimag);
	}

	public ComplexValue con() {
		return new ComplexValue(this.real, -this.imag);
	}

	public String toString() {
		return "(" + this.real + ") + (" + this.imag + ")i";
	}

	public static void main(String[] args) {
		System.out.println(new ComplexValue(1, -3).mul(new ComplexValue(3, 1).con().add(new ComplexValue(1, 1))));
	}
}
