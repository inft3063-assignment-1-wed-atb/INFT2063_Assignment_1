import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		String dollar_symbol = "$";
//COmment
		String itemName;
		String itemCost = "Nil";
		String cash;
		String change;
		String proceed;
		String register;
		String c ="0";
		double balance = 0;
		boolean endProgram = false;
		recieptDemo reciept = new recieptDemo();

<<<<<<< HEAD
		//Delta_17. GPG is Evil. Is Really Evil.5
=======
		//Delta_17. GPG is Evil
		//hate this shit
		//Same here
//hell hello
>>>>>>> branch 'master' of https://github.com/inft3063-assignment-1-wed-atb/INFT2063_Assignment_1.git
		
		Scanner input = new Scanner(System.in);

		while (!endProgram) {
			
			try {
			System.out.print("Please enter cash register's float:");
			register = input.nextLine();
			balance = Double.parseDouble(register);
			} catch(Exception e) {
				System.out.println("Invalid input, please enter a valid number");
			}

			System.out.println("Would you like to proceed with the transaction? (y/n)");
			proceed = input.nextLine();

			if (proceed.equalsIgnoreCase("y")) {

				System.out.print("Please enter the item's name:");
				itemName = input.nextLine();

				System.out.print("Please enter the item's cost:");
				itemCost = input.nextLine();

				Transaction trans = new Transaction(itemName, Double.parseDouble(itemCost));

				System.out.print("Please enter the cash amount tendered:");
				cash = input.nextLine();
				change = Double.toString(Double.parseDouble(cash) - trans.getCost());

				System.out.println("Amount of change required = " + dollar_symbol + change);

				c = Double.toString(balance + trans.getCost());
				
				reciept.itemDetails(itemName, Double.parseDouble(itemCost), 1);
				reciept.cash(Double.parseDouble(cash));
			}
			
			// thanks for coming should be changed in the next update
			else if (proceed.equalsIgnoreCase("n")) {
				endProgram = true;
			}

			else {
				System.out.println("Invalid input. Please try again");
			}
			
		}
		
		endProgram = false;

		while (!endProgram) {

			System.out.println("Would you like a copy of your reciept? (y/n)");
			proceed = input.nextLine();
			
			if (proceed.equalsIgnoreCase("y")) {
				System.out.println(reciept.printReciept());
				endProgram = true;
			}
			else if(proceed.equalsIgnoreCase("n")) {
				endProgram=true;
			}
			else {
				System.out.println("Invalid input. Please try again");
			}
		}

		System.out.println("Thanks for coming.");
		System.out.println("Balance of the Cash Register: " + dollar_symbol + c);

	}
}
