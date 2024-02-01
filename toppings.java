import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class toppings extends ConsoleProgram{
	HashMap<String, ArrayList<String>> toppings = new HashMap<>();
	public void run() {
		addToppings();
	}
	private void addToppings() {
		while(true) {
			String customerName = readLine("enter name: ");
			if(customerName.equals("")){
				break;
			}
			toppings.put(customerName, new ArrayList<>());
			while(true) {
				String topping = readLine("enter topping: ");
				if(topping.equals("")){
					break;
				}
				toppings.get(customerName).add(topping);
			}
		}
	}
}
