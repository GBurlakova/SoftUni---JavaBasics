import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.text.DecimalFormat;

import org.apache.commons.lang3.ArrayUtils;

public class _4_TheSmallestOf3Numbers {

	public static Boolean tryParse(String numAsString){
		try {
			Double.parseDouble(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] numbers = new double[3];
		for (int i = 0; i < 3; i++) {
			while (true) {
				System.out.print("Enter a number: ");
				String numberAsString = scanner.nextLine();
				if (tryParse(numberAsString)) {
					numbers[i] = Double.parseDouble(numberAsString);
					break;
				} else {
					System.out.println("You have entered some wrong data.");
					continue;
				}
			}
		}
		List<Double> numbersList = Arrays.asList(ArrayUtils.toObject(numbers));
		double min = Collections.min(numbersList);
		String minAsString = String.valueOf(min);
		DecimalFormat df = new DecimalFormat("#.##");
		minAsString = df.format(min);
		System.out.printf("The min is %s", minAsString);

	}

}
