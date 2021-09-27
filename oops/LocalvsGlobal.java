package oops;

public class LocalvsGlobal {
int i;
int j;// i,j are global variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalvsGlobal obj=new LocalvsGlobal();
		obj.i=obj.manu();
		System.out.println(obj.i);
		obj.manu();
		
	}
public int manu() {//here i,j are the local variable
	int i=100;
	int j=200;
System.out.println(i+j);
return i+j;
}	
}
