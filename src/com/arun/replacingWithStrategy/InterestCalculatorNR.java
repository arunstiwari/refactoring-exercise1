package com.arun.replacingWithStrategy;

public class InterestCalculatorNR {

	public double calculateInterest(AccountType accountType, double accountBalance) {
		switch (accountType) {
		case SAVINGS:
			return accountBalance * (0.06 / 12);
		case CURRENT:
			return accountBalance * (0.04 / 12);
		case MONEY_MARKET:
			return accountBalance * (0.05 / 12);
		case HIGH_ROLLER_MONEY_MARKET:
			return accountBalance < 10000 ? 0.0 : accountBalance * (.075 / 12);
		default:
			return 0;
		}
	}

}
