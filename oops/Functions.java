package oops;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Functions m=new Functions();
m.manu();
m.vamsi();// dont give return value in out put
int b = m.vamsi();
System.out.println(b);//gives return value in output
m.abhi();
		String c=m.abhi();
		System.out.println(c);
		int d=m.manobhi(60,4);
		System.out.println("division of 60,40 is"+d);
		
		
		
		
		
		
		
		
	}
public void manu() {
	System.out.println("manu method");
}
 
public int vamsi() {
	int i=15;
	int j=19;
	int k=i+j;
	System.out.println("vamsi method");

return k;

}

public String abhi()
{
String a="friend";
System.out.println("abhi method");
	return a;
}

public int manobhi(int x,int y) {
	int div=x/y;
	System.out.println("manobhi method");
	return div;
	
}



}
