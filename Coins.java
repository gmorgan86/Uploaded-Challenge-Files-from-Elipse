package com.qa.helloworld;

public class Coins {

	public static void coins(float cost, float custPaysWith) {
		float change=custPaysWith-cost;
		float twentynote=0;
		float tennote=0;
		float fivenote=0;
		float onepound=0;
		float fiftypence=0;
		float twentypence=0;
		float tenpence=0;
		float fivepence=0;
		float twopence=0;
		float onepence=0;
		
		System.out.println("Change given is £"+ change);
		
		if (change>0.00) {
			while(change >=20) {
				twentynote++;
				change -= 20;
			}
			if (twentynote >0) {
				System.out.println(twentynote + " Twenty Pounds");
			}
			while (change >= 10) {
				tennote++;
				change -= 10;
			}
			if (tennote >0) {
				System.out.println(tennote + " Ten Pounds");
			}
			while (change >= 5) {
				fivenote++;
				change -= 5;
			}
			if (fivenote >0) {
				System.out.println(fivenote + " Five Pounds");
			}
			while (change >= 1) {
				onepound++;
				change -= 1;
			}
			if (onepound >0) {
				System.out.println(onepound + " One Pounds");
			}
			while (change >= 0.5) {
				fiftypence++;
				change -= 0.50;
			}
			if (fiftypence >0) {
				System.out.println(fiftypence + " Fifty Pence");
			}
			while (change >= 0.20) {
				twentypence++;
				change -= 0.20;
			}
			if (twentypence >0) {
				System.out.println(twentypence + " Twenty Pence");
			}
			while (change >= 0.10) {
				tenpence++;
				change -= 0.10;
			}
			if (tenpence >0) {
				System.out.println(tenpence + " Ten Pence");
			}
			while (change >= 0.05) {
				fivepence++;
				change -= 0.05;
			}
			if (fivepence >0) {
				System.out.println(fivepence + " Five Pence");
			}
			while (change >= 0.02) {
				twopence++;
				change -= 0.02;
			}
			if (twopence >0) {
				System.out.println(twopence + " Two Pence");
			}
			while (change >= 0.01) {
				onepence++;
				change -= 0.01;
			}
			if (onepence >0) {
				System.out.println(onepence + " One Pence");
			}
		}
		}
	
	
	
	
	public static void main(String[] args) {
		coins(6.22f, 20f);
	}
}
