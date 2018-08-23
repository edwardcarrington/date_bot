package DateBotApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateBotApplication {
	public static void main(String[] args) throws IOException {

		// Scanner scanner = new Scanner(System.in); // create a scanner object
		final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		// Opening greeting
		System.out.println(
				"Good day! My name is Date-bot, and I'm here to help you calculate the difference between two dates that you input.");

		// Added space
		System.out.println(" ");

		System.out.println(
				"Once you've entered two separate dates for me to compute, I'll show you the difference in years, months and days.");

		// Added space
		System.out.println(" ");

		System.out.println("Simple as that! Now let's get started...");

		// Added space
		System.out.println(" ");

		// User input prompt 1
		System.out.println("Please enter the first date in the following format: MM/DD/YYYY (ex: 01/22/1900)");
		final String firstInput = input.readLine();
		final LocalDate firstDate = LocalDate.parse(firstInput, formatter);

		System.out.println(" ");

		// User input prompt 2
		System.out.println("Now enter the second date in the following format: MM/DD/YYYY (ex: 01/29/2018)");
		final String secondInput = input.readLine();
		final LocalDate secondDate = LocalDate.parse(secondInput, formatter);

		// Period option was key to providing correct date differences

		/*
		 * Added final "long" data type due to the possible wide array of numbers that
		 * could get calculated via user input
		 */

		Period finalDays = Period.between(firstDate, secondDate);
		final long years = finalDays.getYears();
		final long months = finalDays.getMonths();
		final long days = finalDays.getDays();

		// Added space
		System.out.println(" ");

		// Output the difference in days, months and years
		System.out.println("The difference between your first input of " + firstInput + " & your second input of "
				+ secondInput + " is:");

		// Added space
		System.out.println(" ");

		System.out.println("Years:" + years);
		System.out.println("Months:" + months);
		System.out.println("Days:" + days);
	}
}
