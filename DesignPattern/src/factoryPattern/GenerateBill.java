package factoryPattern;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your plan");
		String name=sc.next();
		
		System.out.println("Enter units");
		int units=sc.nextInt();
		
		PlanInput pi=new PlanInput();
		
		Plan p= pi.getPlan(name);
		p.getrate();
		p.generateBill(units);
		
	}

}
