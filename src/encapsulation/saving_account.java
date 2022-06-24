package encapsulation;

public class saving_account {
private static double balance;
double deposit = 5000;
double withdraw = 200;
public void setbalance(double balance) {
	this.balance= balance+deposit;
	System.out.println("opening balance is" +this.balance);
	
}
public double getbalance() {
	balance= deposit-withdraw;
	System.out.println("withdraw amount is" +withdraw);
	return balance;
}
	public static void main(String[] args) {
		saving_account sa= new saving_account();
		sa.setbalance(balance);
		
		System.out.println("balance is" +sa.getbalance());
		

	}

}
