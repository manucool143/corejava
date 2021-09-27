package oops2;

public class B extends A {
	public B() {
		super(10,20);//we must declre super key word if we dont have default constructor in parent class
		System.out.println("B constructor");
	}
	public B(int i,int j) {
		super(20,40);// super key word must be declared in first statement only
		System.out.println("i value in B"+i);
		System.out.println("j value in B"+j);
		//super(10,20);
	}
public static void main(String manu[]) {
	B obj=new B();
	System.out.println("**********");
	B obj1=new B(100,200);
}
}
