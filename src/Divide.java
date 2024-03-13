public class Divide implements Calculator.Operator{

	@Override
	public double operate(double n1, double n2) {
		return n1/n2;
	}

	@Override
	public char getOperatorChar() {
		return '/';
	}

	@Override
	public String describe() {
		return "나누기";
	}

}
