package com.qa.helloworld;

public class FlowCharts {
	
private static final int A = 0;
//	public static void yeyOrNay(int num1, int num2, boolean bool) {
//		if (bool==true) {
//			System.out.println(num1+num2);
//			
//		}else {
//			System.out.println(num1*num2);
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		yeyOrNay(6,2, false);
//		
//	}
	public static void flowChart(int A) {
		if (A>2000) {
			System.out.println("A");
			if(A>6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if(A>4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
			}
		}
	}
//		else {
//		System.out.println("1");
//		if(A>100) {
//			System.out.println("3");
//		}else {
//			System.out.println("2");
//			if (A>600) {
//				System.out.println("5");
//				
//			}else {
//				System.out.println("4");
//			if (A>500) {
//				System.out.println("6");
//			}else {
//				System.out.println("7");
//			}
//	}
//		}
//	}
	public static void main(String[] args) {
		flowChart(4000);
	}
	
	
}
