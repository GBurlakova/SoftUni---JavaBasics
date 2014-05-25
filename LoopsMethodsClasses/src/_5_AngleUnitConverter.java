import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class _5_AngleUnitConverter {

	public static String getNumberOfAString(String str) {
		int i = 0;
		String numberAsString = "";
		while (str.charAt(i) != ' ') {
			numberAsString += str.charAt(i);
			i++;
		}
		return numberAsString;
	}
	
	public static String convertToRadOrDeg(String str) throws InputMismatchException{
		int conversionType = 0;
		String measureString = "";
		if (str.contains("rad")) {
			conversionType = 1;
			measureString = " deg";
		} else {
			conversionType = 2;
			measureString = " rad";
		}
		double inputNumber = Double.parseDouble(getNumberOfAString(str));
		double outputNumber = 0;
		switch (conversionType) {
			case 1: outputNumber = Math.toDegrees(inputNumber); break;
			case 2: outputNumber = Math.toRadians(inputNumber); break;
		}
		String output = String.format("%.6f %s", outputNumber, measureString);
		return output;
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of conversions: ");
		int queries = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < queries; i++) {
			System.out.print("Enter input for converson: ");
			String input = scanner.nextLine();
			String output = convertToRadOrDeg(input);
			System.out.println(output);
		}

	}

}
