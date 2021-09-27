package oops;

public class CallByvalvsCallByref {
int p;
int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByvalvsCallByref obj=  new CallByvalvsCallByref();
	
	
		System.out.println("before sawp");
		
		int k=obj.testsum(10,20);// call by value
		System.out.println("sum of numbers"+k);
		obj.p=50;
		obj.q=60;
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);// call by reference
		System.out.println("*********");
		System.out.println("after swap");
		System.out.println(obj.p);
System.out.println(obj.q);
System.out.println("888888888888");
System.out.println("before change"+obj.p);//60
obj.change(500);
System.out.println("after change"+obj.p);// in this case of call by value the original value does not change
	}
public int testsum(int a, int b) {
	int c = a+b;
	return c;
}
//call by reference
public void swap(CallByvalvsCallByref t) {
	int temp;
	System.out.println(p);// global variable can be access directly out the main body
	temp=t.p;
	t.p=t.q;
	t.q=temp;
}
	public void change(int p) {
		p=p+100;
	}
	
	
	
	
}
