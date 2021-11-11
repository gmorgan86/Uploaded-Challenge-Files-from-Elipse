package com.qa.encapsulation;

public class encapsulate {

	private int passportNumber;
	private String memorableWord;
	
	
	//constructors
	public encapsulate(int passportNumber, String memorableWord) {
		this.passportNumber = passportNumber;
		this.memorableWord = memorableWord;
	}

	public encapsulate() {
		super();
	}

	//getters and setters
	public int getPassportNumber() {
		return passportNumber;
	}

	

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getMemorableWord() {
		return memorableWord;
	}

	public void setMemorableWord(String memorableWord) {
		this.memorableWord = memorableWord;
	}
	
	
	@Override
	public String toString() {
		return "encapsulate [passportNumber=" + passportNumber + ", memorableWord=" + memorableWord + "]";
	}
	
	
	
	
}
