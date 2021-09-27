package interfaceclass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank h=new HdfcBank();
		System.out.println(HdfcBank.min_bal);
		h.credit();
		h.debit();
		h.mutualfunds();
		h.homeLoan();
		
		

	}

}
