package com.arun.replacingWithStrategy;

public class HighRollerMoneyMarketCalculator implements InterestCalculatorStrategy {

    public HighRollerMoneyMarketCalculator() {
    }


    public double calculateInterest(double accountBalance) {
        return accountBalance < 10000 ? 0.0 : accountBalance * (.075 / 12);
    }
}