package Day8Hw;

import java.util.Scanner;

public class Circumference {

	public static double Circumference(double r) {
		return (2*3.14*r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = sc.nextDouble();
		
		System.out.println("Circumference of circle:" +Circumference(radius));
	}
}
