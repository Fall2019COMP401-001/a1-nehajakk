package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		process(s);
		
	}
	
	public static void process(Scanner scan) {
		
		int cust= scan.nextInt();
		
		for (int i=0; i < cust; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int items = scan.nextInt();
			
			double total = 0;
			
			for (int j=0; j < items; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total = total + (price * quantity);
			}
			
			String answer = String.format("%,.2f",total);
			System.out.println(fname.substring(0,1)+ ". " + lname + ":" + " " + answer);
		}
	}
}


