package july27OOPs;

public class C extends B{

	C(){
		//super("Saturday");
		//super(1001);
		System.out.println("Constructor of C");
	}
	C(int a){
		super(1234);
		System.out.println("Constructor of C : " + a);
	}
	public void method4(){
		
		System.out.println("Method 4");
	}
}
