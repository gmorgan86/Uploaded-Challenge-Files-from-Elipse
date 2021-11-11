package com.qa.helloworld;

public class Results {
	
		public static double total;
		public static double percentage = (total *100)/450;
		
	public static double marks(double physics, double chemistry, double biology) {
		System.out.println("Physics: "+ physics);
		System.out.println("Chemistry: "+ chemistry);
		System.out.println("Biology: "+ biology);
		
		total = physics+chemistry+biology;
		System.out.println("Total: " + total);
		return total;
		
//		double percentage = (total *100)/450;
//		System.out.println("Your percecntage is "+percentage+"%");
	}
	
	public static void percent(double percentage) {
		percentage = (total * 100) / 450;

		System.out.println("Your percentage is "+percentage+"%");
		
	}

	public static void main(String[] args) {
		marks(60, 60, 60);
		percent(percentage);
	}
}
