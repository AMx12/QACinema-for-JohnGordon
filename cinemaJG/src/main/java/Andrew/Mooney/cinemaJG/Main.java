package Andrew.Mooney.cinemaJG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logic lg = new Logic();
		DiscountDay dd = new DiscountDay();
		TicketManager tm = new TicketManager();

		boolean inCustomerUse = true;
		int menuChoice = 0;
		Scanner userInput = new Scanner(System.in);

		while (inCustomerUse) {
			System.out.println("\n" + dd.dayMeth() + "\n");
			System.out.println("\n1. Choose amount of Standard Tickets \n2. Choose amount of OAP Tickets");
			System.out.println("3. Choose amount of Student Tickets \n4. Choose amount of Child Tickets");
			System.out.println("5. To purchase Tickets");
			System.out.println("99. to quit");
			System.out.println("\nPlease choose your option.");
			menuChoice = userInput.nextInt();

			if (5 < menuChoice && menuChoice < 99) {
				System.out.println("Please enter number 1-5 or 99 to exit.");
				inCustomerUse = false;
				main(args);
			}

			switch (menuChoice) {

			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("How many tickets would you like?");
				lg.ticketPricer(userInput.nextInt(), menuChoice);
				break;

			case 5:
				System.out.println("You purchased:");
				System.out.println(lg.standardCounter + tm.tSt.toString() + lg.standardPrice);
				System.out.println(lg.oapCounter + tm.tOp.toString() + lg.oapPrice);
				System.out.println(lg.studentCounter + tm.tSu.toString() + lg.studentPrice);
				System.out.println(lg.childCounter + tm.tCh.toString() + lg.childPrice);
				if (dd.day == 3) {
					lg.totalPrice -= lg.totalCounter * lg.discount;
					System.out.println("Our Wednesday discount was " + lg.totalCounter * lg.discount);
				}
				System.out.println("Total: " + lg.totalPrice);
				System.out.println("Thank you for using QA Cinemas.");
				inCustomerUse = false;
				break;

			case 99:
				System.out.println("Thank you for trying QA Cinemas.");
				System.exit(0);
				break;
			}
			System.out.println("Price: £" + lg.totalPrice);

		}
		userInput.close();
	}

}
