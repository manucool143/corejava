package JavaBasics;

public class Array {
	public static void main(String[] args) {
		int i[]=new int [5];
		i[0]=5;
		i[1]=7;
		i[2]=14;
		i[3]=15;
		i[4]=19;
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		String x[][]=new String[3][4];
		x[0][0]="1";
		x[0][1]="Manu";
		x[0][2]="26";
		x[0][3]="14/05/1998";
		x[1][0]="2";
		x[1][1]="Vamsi";
		x[1][2]="16";
		x[1][3]="15/03/1999";
		x[2][0]="3";
		x[2][1]="Manohar";
		x[2][2]="29";
		x[2][3]="17/12/2000";
		for(int X=0;X<x.length;X++) {
			for(int y=0;y<x[0].length;y++) {
				System.out.print(x[X][y]);
			System.out.print("     ");
				
			}
		System.out.println();
		}
		
		Object obj[]=new Object[5];
		obj[0]=1;
		obj[1]="Manu";
		obj[2]=17/05/1998;
		obj[3]=23.45;
		obj[4]=9.8;
		for (int j=0;j<obj.length;j++) {
			System.out.println(obj[j]);
		}
	}

}
