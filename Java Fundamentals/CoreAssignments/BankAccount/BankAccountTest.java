public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();
	
	user1.accountDeposit("Checking", 100.00);
	user1.accountWithdrawal("Checking", 200.00);
	user1.myBalance();
	
	user2.accountDeposit("checking", 500.00);
	user2.accountWithdrawal("checking", 325.00);
	user2.myBalance();
	
	user3.accountDeposit("savings", 7000.00);
	user3.accountWithdrawal("savings", 1500.00);
	user3.myBalance();

	
	
	}
}