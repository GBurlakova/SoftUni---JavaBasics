import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter text.");
		String text = scanner.nextLine();
		String regExpr = "[a-z]+([.\\-_]*[a-z])*@[a-z]+[.\\-_a-z]*([.]+[a-z]{2,10})+";
		Pattern pattern = Pattern.compile(regExpr);
		Matcher matcher = pattern.matcher(text);
		if (matcher.find()) {
			matcher = pattern.matcher(text);
			System.out.println("Emails found:");
			while (matcher.find()) {
				System.out.println("- " + matcher.group());
			}
		} else {
			System.out.println("No matches found.");
		}
		

	}

}
