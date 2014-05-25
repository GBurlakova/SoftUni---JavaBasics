import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class _9_ListOfProducts {

	public static void printCollection(ArrayList<Product> collection) {
		for (Product product : collection) {
			System.out.println(product);
		}
	}
	
	public static void createFileFromArrList(ArrayList<Product> products, String filePath){
		try (FileWriter writer = new FileWriter(filePath)){
			for (Product product : products) {
				String productString = product.toString();
				writer.write(productString);
				writer.write(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		String fileString = "src" + File.separator + "IOFiles" + File.separator + "InputFileProductsProblem9.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileString))){
			ArrayList<Product> productsList = new ArrayList<Product>();
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				String[] productString = line.split(" ");
				double price = 0;
				String name = "";
//				ArrayList<Product> productsList = new ArrayList<Product>();
				if (ParseNumbers.tryParseDouble(productString[1])) {
					price = Double.parseDouble(productString[1]);
					name = productString[0];
				} else {
					throw new NumberFormatException();
				}
				productsList.add(new Product(price, name));
			}
			printCollection(productsList);
			System.out.println();
			Collections.sort(productsList);
			printCollection(productsList);
			String fileOutput = "src" + File.separator + "IOFiles" + File.separator + "OutputFileProductsProblem9.txt";
			createFileFromArrList(productsList, fileOutput);
		} catch (FileNotFoundException e) {
			System.err.println("File not found.");
		} catch (IOException e) {
			System.err.println("Input output exception occirred.");
		}
	}
}
