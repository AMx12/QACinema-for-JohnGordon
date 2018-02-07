package Andrew.Mooney.cinemaJG;

public class Tickets {

	private String type;
	private int price;

	public Tickets(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public String toString() {
		return " " + type + " Ticket(s) costing £" + price + " each, for a total of £";
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

}
