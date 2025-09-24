package banking;

public class Account {
	private int acc_no;
	private String name ;
	private double balance;
	public Account(int acc_no,String name ,double balance) {
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(double amount){
		if(amount<=0) {
			throw new ArithmeticException("deposit cannot be 0 or -ve");
		}
		balance+=amount;
		System.out.println("deposited :"+amount);
	}
	public void withdraw(double amount)throws InsuffecientBalanceException{
		if(amount<=0) {
			throw new ArithmeticException("withdrawal cannot be 0 or -ve");
		}
	if(amount>balance) {
		throw new InsuffecientBalanceException("insufficient balance");
	}
	balance-=amount;
	System.out.println("withdrawn :"+amount);
}
public void showBalance() {
	System.out.println("account no. :"+acc_no+",name:"+name+",balance"+balance);
}
}