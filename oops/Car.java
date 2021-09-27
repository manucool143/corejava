package oops;

public class Car {
int mod;
int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a= new Car();// a is the object reference & Car() is the object & new is the keyword to create objectX
Car b=new Car();
Car c= new Car();

a.mod=2015;
a.wheel=4;
b.mod=2016;
b.wheel=6;
c.mod=2014;
c.wheel=3;
 System.out.println(a.mod);
 System.out.println(a.wheel);
 System.out.println(b.mod);
 System.out.println(b.wheel);
 System.out.println(c.mod);
 System.out.println(c.wheel);
 
		a=b;
		b=c;
		c=a;
		System.out.println("after changing the values");
		System.out.println(a.mod);//2016
		c.mod=15;// changes a also simultaneously
		System.out.println("after changing c.mod");
		System.out.println(a.mod);// 15
		a.wheel=8;
		System.out.println("after changing a");
		System.out.println(c.wheel);
		
		
		
		
	}

}
