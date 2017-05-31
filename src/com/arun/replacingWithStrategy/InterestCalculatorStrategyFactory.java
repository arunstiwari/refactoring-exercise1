package com.arun.replacingWithStrategy;

public  class InterestCalculatorStrategyFactory {
	public InterestCalculatorStrategy calculationStrategy;

	public InterestCalculatorStrategyFactory() {
	}
	
	public InterestCalculatorStrategy getInterestCalculationStrategy(AccountType accountType){
		switch(accountType){
		case SAVINGS: 
			return new SavingAccountCalculator();
		case CURRENT: 
			return new CurrentAccountCalculator();
		case MONEY_MARKET: 
			return new MoneyMarketCalculator();
		case HIGH_ROLLER_MONEY_MARKET: 
			return  new HighRollerMoneyMarketCalculator();
		default:
			return null;
	}
	}
}

