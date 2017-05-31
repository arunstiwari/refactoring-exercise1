package com.arun.replacingWithStrategy;

public class MoneyMarketCalculator implements InterestCalculatorStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.05 /12);
	}

}
