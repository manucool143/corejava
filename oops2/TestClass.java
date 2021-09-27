package oops2;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		b.start();// implements child class method
		b.stop();
		b.refuel();
		Car c=new BMW();// parent class reference can refer child class object
		//BMW ch=(BMW)new Car(); gives class cast exception
		//but child class reference can not refer parent class object
		//c.theftSafty();  parent class reference can not access child class methods
		b.theftSafty();
		Honda h=new Honda();
		h.milage();
		h.start();
		c.start();// implements child class method
		Car c1= new Car();
		c1.start();// Implements car class method
	

		

	}

}
