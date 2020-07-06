package july27OOPs;

public class B extends A {

	
   B(){
		
		System.out.println("Constructor of B");
	}
	B(String a){
		//super(100111);
		System.out.println("Parameterized constructor recieved value : " + a);
	}
	B(int a){
		super(100);
		System.out.println("Parameterised constructor of B : " + a);
	}
	public void method3(){
		
		System.out.println("Method 3");
	}
	
}
