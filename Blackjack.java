package com.qa.helloworld;

public class Blackjack {
	
    public static int play(int num1, int num2) {
    	if((num1>num2) && (num1<=21)) {
    		return num1;
    	}else if((num2>num1) && (num2 <=21)) {
    		return num2;
    	}else if ((num1>21) && (num2 <21)) {
    		return num2;
    	}else if ((num1>21) && (num2<21)) {
    		return num2;
    	}else if ((num2>21) && (num1<=21)) {
    		return num1;
    	}else {
    		return 0;
    	}
    }
}