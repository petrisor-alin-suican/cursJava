package curs9;

public class Account {
	
	public int balance = 0;
	
	
	
	public void deposit (int amount) {
		
		if(amount <= 0) {
	//		throw new InvalidAmountException(amount +  " is not valid!");
		}else {
			balance = balance + amount;
			
		}
		
		
		
		
	}
	
	

}
