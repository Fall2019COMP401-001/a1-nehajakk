package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		process(s);
		
	}
	
	public static void process(Scanner s) {
		
		int number_items_store = s.nextInt();
		String item_name[] = new String[number_items_store];
		int customer_count[] = new int[number_items_store];
		int total_bought[] = new int[number_items_store];
		for (int a = 0; a < number_items_store; a++) {
			item_name[a] = s.next();
			double price_item = s.nextDouble();
		}
		int num_of_cust = s.nextInt();
		
		for (int d = 0; d < num_of_cust; d++) {
			String fname = s.next();
			String lname = s.next();
			int total_items_each_bought = s.nextInt();
			
			boolean boolean_duplicate[] = new boolean[number_items_store];
			
			for(int i = 0; i < total_items_each_bought; i++) {
				int each_indiv_item_bought_num = s.nextInt();
				String indiv_item_name = s.next();
				int index = findindx(indiv_item_name, item_name);
				boolean_duplicate[index] = true;
				total_bought[index] += each_indiv_item_bought_num;	
			}
			
			for (int i=0; i < number_items_store; i++) {
				if (boolean_duplicate[i] == true) {
					customer_count[i] += 1;
				}
			}
			
			
		}
		for (int c = 0; c < number_items_store; c++) {
			if(total_bought[c] > 0) {
				System.out.println(customer_count[c] + " customers bought " + total_bought[c] + " " + item_name[c]);
			} else {
				System.out.println("No customers bought " + item_name[c]);
			}
		}
}
public static int findindx(String item_name, String[] names) {
	for (int z=0; z< names.length; z++) {
		if (names[z].equals(item_name)) {
			return z;			
		}
		
	}
	return 1;
	
}}
