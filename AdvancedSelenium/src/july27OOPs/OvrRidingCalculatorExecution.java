package july27OOPs;

public class OvrRidingCalculatorExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OverRideCalculatorInt calc = new OverRideCalculatorInt();
		int temp = calc.add(10, 20);
		float temp1 = calc.add(10.5f, 20.5f);
		
		System.out.println(temp);
		System.out.println(temp1);
	}

}
