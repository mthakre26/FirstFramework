package july27OOPs;

public class OverlloadTestExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OverloadTest ot = new OverloadTest();
		ot.add(10.5f, 11.7f);
	}
  
	public static void main(int[] args){  // we can have overloading in main but 
		//it is of no use as there is a signature in jvm of "public static void main(String[] args)"
		System.out.println("main with int");
	}
	public static void main(String args){  // we can have overloading in main but 
		//it is of no use as there is a signature in jvm of "public static void main(String[] args)"
		System.out.println("main with string");
	}
}
