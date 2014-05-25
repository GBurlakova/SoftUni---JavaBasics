import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class _7_DaysBetweenTwoDates {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String formatString = "dd-MM-yyyy";
			DateFormat dtFormat = new SimpleDateFormat(formatString);
			System.out.printf("Enter date in the format %s: ", formatString);
			String firstDateAsString = scanner.nextLine();
			Date firstDate = dtFormat.parse(firstDateAsString);
			System.out.printf("Enter date in the format %s: ", formatString);
			String secondDateAsString = scanner.nextLine();
			Date secondDate = dtFormat.parse(secondDateAsString);
			long differenceMilliseconds = secondDate.getTime() - firstDate.getTime();
			long daysBetween = TimeUnit.DAYS.convert(differenceMilliseconds, TimeUnit.MILLISECONDS);
			System.out.printf("Days between %S and %s: %s", 
					dtFormat.format(firstDate), dtFormat.format(secondDate), daysBetween);
		} catch (ParseException pex) {
			System.out.println("Parse exception occurrured.");
		}
		
	}

}
