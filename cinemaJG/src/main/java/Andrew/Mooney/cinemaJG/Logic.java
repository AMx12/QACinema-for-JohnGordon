package Andrew.Mooney.cinemaJG;

public class Logic {

	int discount = 2;

	int standardPrice = 0;
	int standardCounter = 0;

	int oapPrice = 0;
	int oapCounter = 0;

	int studentPrice = 0;
	int studentCounter = 0;

	int childPrice = 0;
	int childCounter = 0;

	int totalPrice = 0;
	int totalCounter = 0;

	TicketManager tm = new TicketManager();

	public void ticketPricer(int amount, int choice) {

		switch (choice) {
		case 1:
			choice = 1;
			standardPrice = amount * tm.tSt.getPrice();
			standardCounter = amount;
			break;
		case 2:
			choice = 2;
			oapPrice = amount * tm.tOp.getPrice();
			oapCounter = amount;
			break;
		case 3:
			choice = 3;
			studentPrice = amount * tm.tSu.getPrice();
			studentCounter = amount;
			break;
		case 4:
			choice = 4;
			childPrice = amount * tm.tCh.getPrice();
			childCounter = amount;
			break;
		}

		totalPrice = standardPrice + studentPrice + oapPrice + childPrice;
		totalCounter = standardCounter + studentCounter + oapCounter + childCounter;

	}

}
