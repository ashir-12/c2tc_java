package com.tns.interfaceprg;

public class BankApplicationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank bank=new BankImpl();
		Account account=new Account(123455,"suma",15550,bank);
	
		account.deposit(2000);
		System.out.println(account);

		account.withdraw(10000);
		System.out.println(account);
	}

}
