package com.arun.replacingWithStrategy;

public class CurrentAccountCalculator implements InterestCalculatorStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.04 /12);
	}

}
