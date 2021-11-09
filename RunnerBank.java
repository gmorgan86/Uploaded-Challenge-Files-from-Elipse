package com.qa.helloworld;

public class RunnerBank {
	
	public static void main(String[] args) {
		BankDetails accountone = new BankDetails("Gareth", "Morgan", 123456, 543765, 50000);
		System.out.println(accountone.getFirstName());
		System.out.println(accountone.getSortCode());
		System.out.println(accountone.getAccBalance());
		accountone.setAccBalance(75000);
		System.out.println(accountone.getAccBalance());
		BankDetails.checkBalance("George", "Baker", 300.00);
	}

	
	}

