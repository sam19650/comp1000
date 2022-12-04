package exam3;

public class Account {

	private float balance;
	
	public Account(float initialBalance) {
		balance = initialBalance;
	}

	public float getBalance() {
		return balance;
	}

	public void updateBalance(double creditOrCharge) {
		balance += creditOrCharge;
	}

	@Override
	public String toString() {
		return String.format("Account [balance = %.2f]", getBalance());
	}

	public static void main(String[] args) {
		Account account; // Atef's account
		
		account = new Account(100);
		System.out.println(account);
		
		account.updateBalance(20);
		System.out.println(account);
		
		account.updateBalance(-35);
		System.out.println(account);
	}
	
}
