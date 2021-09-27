package interfaceclass;

public class HdfcBank implements UsaBank,GermanyBank  {// impemENting class must define all methods given in parent class
	public void credit() {                              // THIS IS CALLED " IS A RLATIONSHIP"
		System.out.println("hdfc ....credit");
	}
public void debit() {
	System.out.println("hdfc....debit");
}
public void homeLoan() {
	System.out.println("hdfc homeloan");
}
public void mutualfunds() {
	System.out.println("mutual funds");
}

	

}
