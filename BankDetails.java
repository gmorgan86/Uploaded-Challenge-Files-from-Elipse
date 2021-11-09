package com.qa.helloworld;

public class BankDetails {
	private String firstName;
	private String lastName;
	private double sortCode;
	private double accountNumber;
	private double accBalance;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSortCode() {
		return sortCode;
	}
	public void setSortCode(double sortCode) {
		this.sortCode = sortCode;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	
	public BankDetails(String firstName, String lastName, double sortCode, double accountNumber, double accBalance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
		this.accBalance = accBalance;
	}
	
	public static void checkBalance(String firstName, String lastName, Double accBalance) {
		System.out.println("Your details are: " + firstName + " " + lastName + " and your balance is " + accBalance);
		
	}
	
	
		
}
