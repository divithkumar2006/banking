package banking;

public class InsuffecientBalanceException extends Exception{
   public InsuffecientBalanceException(String message) {
	   super(message);
   }
}
