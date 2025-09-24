package banking;

public class Main {
	public static void main(String[] args) {
		Account account=new Account(790,"boss",20000);
		account.showBalance();
		account.deposit(14000);
		account.showBalance();
		try {
			account.withdraw(20000);
		}catch(InsuffecientBalanceException e) {
			System.out.println("error:"+e.getMessage());
		}
		account.showBalance();
		try {
			account.withdraw(70000);
		}catch(InsuffecientBalanceException e) {
			System.out.println("error:"+e.getMessage());
		}
		account.showBalance();
	}

}
