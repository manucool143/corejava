
package oops;

public class MethodoverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodoverLoading obj= new MethodoverLoading();
		obj.manu();
		obj.manu("manu string");
		String b=obj.manu("i am manu String");
		System.out.println(b);
int j=obj.manu(10);
System.out.println(j);
int a =obj.manu(10,20);
System.out.println(a);

		
		
		
		
	}
public void manu() {
	System.out.println("manu method");
}
public int manu(int a)
{
System.out.println(a);	
return a;
}
public String manu(String b) {
	return b;
	
}
public int manu(int a,int b) {
	return a+b;
}



}
