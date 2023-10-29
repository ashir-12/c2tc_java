package com.tns.interfaceprg;

public class BankImpl implements bank{

public void deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount>DEPOSIT_LIMIT)
			System.out.println("deposit not possible");
			else
				account.setBalance(account.getBalance()+amount);
		
	}

	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		if(account.getBalance()-amount>=MIN_BALANCE) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("withdraw"+amount+"from account"+account.getAccNo());
		}
			else
				System.out.println("insufficient balance");
			
		}
}
		
