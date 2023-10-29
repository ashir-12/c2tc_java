package com.tns.interfaceprg;

public interface bank {
	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	double INTREST_Rate=7.8;
	
	void deposit(Account account, double amount);
	void withdraw(Account account, double amount);
}
