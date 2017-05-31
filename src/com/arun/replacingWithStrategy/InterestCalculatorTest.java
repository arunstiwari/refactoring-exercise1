package com.arun.replacingWithStrategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculatorTest {
	
	private InterestCalculator interestCalculator = new InterestCalculator();

	@Test
	public void calculateInterestForSavingAccount() throws Exception {
		double interest = interestCalculator.calculateInterest(AccountType.SAVINGS,1200.00);
		assertEquals(6.0, interest,0.0);
	}
	
	@Test
	public void calculateInterestForCurrentAccount() throws Exception {
		double interest = interestCalculator.calculateInterest(AccountType.CURRENT,1200.00);
		assertEquals(4.0, interest,0.0);
	}
	
	@Test
	public void calculateInterestForStandardMoneyMarket() throws Exception {
		double interest = interestCalculator.calculateInterest(AccountType.MONEY_MARKET,1200.00);
		assertEquals(5.0, interest,0.0);
	}
	
	@Test
	public void calculateInterestForHighRollerMoneyMarket() throws Exception {
		double interest = interestCalculator.calculateInterest(AccountType.HIGH_ROLLER_MONEY_MARKET,1200.00);
		assertEquals(0.0, interest,0.0);
		
		double interest1 = interestCalculator.calculateInterest(AccountType.HIGH_ROLLER_MONEY_MARKET,120000.00);
		assertEquals(750.0, interest1, 1.0);
	}

}
