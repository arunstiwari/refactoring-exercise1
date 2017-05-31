package com.arun.replacingWithStrategy;

public interface InterestCalculationStrategy {

	double calculateInterest(AccountType accountType, double accountBalance);

}