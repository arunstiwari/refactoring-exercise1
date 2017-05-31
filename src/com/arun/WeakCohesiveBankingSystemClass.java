package com.arun;

public class WeakCohesiveBankingSystemClass {

	public void addCustomer(String customerName, String customerAddress,
							String accountNumber, double balance){
		
	}
	
	public void removeCustomer(String accountNumber){}
	public void creditAccount(String accountNumber, double amount){}
	public void debitAccount(String accountNumber, double amount){}
	public boolean checkSufficientFunds(String accountNumber, double checkAmount){ return true;}
	public void sendStatement(String accountNumber){}

}
