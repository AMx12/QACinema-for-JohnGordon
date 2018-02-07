package Andrew.Mooney.cinemaJG;

import java.util.Random;

public class DiscountDay {

	Random rand = new Random();

	public int day = rand.nextInt(7) + 1;

	String dayString = null;

	public String dayMeth() {
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
		}
		return dayString;
	}
}
