package com.arun.replacingWithStrategy;

public class InterestCalculator {

	private InterestCalculatorStrategyFactory factory = new InterestCalculatorStrategyFactory();

	public double calculateInterest(AccountType accountType, double accountBalance) {
		return factory.getInterestCalculationStrategy(accountType).calculateInterest(accountBalance);
	}

}
