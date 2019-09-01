package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			process(s);
		
	}
	
	public static void process(Scanner s) {
		int num_items_store = s.nextInt();
		String name_item[] = new String[num_items_store];
		Double price_item[] = new Double [num_items_store];
		for(int d=0; d < num_items_store; d++) {
			name_item[d] = s.next();
			price_item[d] = s.nextDouble();
		}
		int num_cust = s.nextInt();
		String customers[] = new String[num_cust];
		Double cust_total[] = new Double[num_cust];
		for(int i=0; i < num_cust; i++) {
			String fname = s.next(); 
			String lname = s.next();
			customers[i] = fname + " " + lname;
			double totalprice = 0;
			int num_of_items = s.nextInt();
			for(int x=0; x < num_of_items; x++) {
				int item_num = s.nextInt();
				String item = s.next();
				for(int k=0; k < num_items_store; k++) {
					if(item.equals(name_item[k])) {
						double price = price_item[k];
						price = price * item_num;
						totalprice = totalprice + price;
					}
				}
			}
			cust_total[i] = totalprice;
		}
		
		int maxcount = 0;
		int mincount = 0;
		double max = cust_total[0];
		double min = cust_total[0];
		double total = cust_total[0];
			
				
		for(int i1=1; i1 < num_cust; i1++) {
				
					if(cust_total[i1] > max) {
							max = cust_total[i1];
							maxcount = i1;
					}
					if(cust_total[i1] < min) {
							min = cust_total[i1];
							mincount = i1;
					}
					total += cust_total[i1];
			}
		double average = total/num_cust;
		String ans1 = String.format("%,.2f", cust_total[maxcount]);
		String ans2 = String.format("%,.2f", cust_total[mincount]);
		String ans3 = String.format("%,.2f", average);
			
			
		System.out.println("Biggest: " + customers[maxcount] + "(" + ans1 + ")");
		System.out.println("Smallest: " + customers[mincount] + "(" + ans2 + ")");
		System.out.println("Average: " + ans3);
			}

	}








