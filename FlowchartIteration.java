package com.qa.helloworld;

public class FlowchartIteration {

	public static void flow1() {
		for(int a=100; a<=200; a++) {
			System.out.println("A");
			if(a==200) {
				System.out.println("End");
			}
		}
	}
	
	public static void flow2() {
		for(int a=100; a<=200; a++) {
			if(a%2== 0) {
				System.out.println(a + " -");
			}else {
				System.out.println(a + " *");
			}
		}
	}
	public static void flow3() {
		for(int num =1; num<=10; num++) {
			for(int count=1; count<=10; count++) {
			System.out.println(count);

			}

			}
		}
		
	public static void flow5(int valueEntered) {
		if(valueEntered<=10) {
		for(int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				System.out.println(i);
			}
		}
		}
	}
	
	
	
	public static void main(String[] args) {
//		flow1();
//		flow2();
//		flow3();
		flow5(9);
	}
}
