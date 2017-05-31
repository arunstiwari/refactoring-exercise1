package com.arun.replacingWithStrategy;

public class SavingAccountCalculator implements InterestCalculatorStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.06 /12);
	}

}
