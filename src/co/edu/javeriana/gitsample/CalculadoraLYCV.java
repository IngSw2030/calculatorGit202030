package co.edu.javeriana.gitsample;

public class CalculadoraLYCV implements ICalculator{

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		return a/b;
	}

	@Override
	public double substract(double a, double b) {
		return a-b;
	}

	@Override
	public String about() {
		System.out.println("Calculator implementend by << " + Authors.LYCV + ">>");
		return null;
	}
    
}