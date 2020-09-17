package co.edu.javeriana.gitsample;

public class CalculadoraJPMP implements ICalculator  {
	
	public double add(double a, double b) {
		return a + b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
	public double substract(double a, double b) {
		return a - b;
	}
	public String about() {
		String linea="Calculator implementend by << "+ Authors.JPMP +" >>";
		return linea;
	}
}
