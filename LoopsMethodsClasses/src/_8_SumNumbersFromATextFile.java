import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _8_SumNumbersFromATextFile {

	public static void main(String[] args) {
		String file = "src" + File.separator + "IOFiles" + File.separator + "InputFileNumbersProblem8.txt";
		int sum = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			while (true) {
				String numString = reader.readLine();
				if (numString != null) {
					int currentNum = Integer.parseInt(numString);
					sum += currentNum;
				} else {
					break;
				}
			}
			System.out.printf("The sum is: %d", sum);
		} catch (FileNotFoundException e) {
			System.err.println("File not fount.");
		} catch (IOException e) {
			System.err.println("Error occurred.");
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatExceptrion occurred.");
		}
	}

}
