package co.edu.javeriana.gitsample;

public class CalculadoraJMY implements ICalculator  {
	
	public double add(double a, double b) {
		double c=a + b;
		return c;
	}
	public double multiply(double a, double b) {
		double c= a * b;
		return c;
		
	}
	public double divide(double a, double b) {
		double c=a / b;
		return c;
	}
	public double substract(double a, double b) {
		double c=a - b;
		return c;
	}
	public String about() {
		String linea="Calculator implementend by << "+ Authors.JMY +" >>";
		return linea;
	}
	
	
	
}
