import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.TreeMap;

public class _10_OrderOfProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		String productsInputFile = "src" + File.separator +"IOFiles" + File.separator + "ProductsInputProblem10.txt";
		TreeMap<String, Double> products = new TreeMap<String, Double>();
		try(BufferedReader reader = new BufferedReader(new FileReader(productsInputFile))){
			while (true) {
				String productAsString = reader.readLine();
				if (productAsString == null) {
					break;
				}
				String[] product = productAsString.split(" ");
				String productName = product[0];
				double price = Double.parseDouble(product[1]);
				products.put(productName, price);
			} 
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.err.println("Input output exception occured.");
		}
		
		String ordersInputFile = "src" + File.separator +"IOFiles" + File.separator + "OrdersInputProblem10.txt";
		Double totalPrice = 0.0;
		try (BufferedReader reader = new BufferedReader (new FileReader(ordersInputFile))){
			while (true) {
				String orderString = reader.readLine();
				if (orderString == null) {
					break;
				}
				String[] order = orderString.split(" ");
				String orderedProduct = order[1];
				Double quantity = Double.parseDouble(order[0]);
				Double costCurentOrder = quantity * products.get(orderedProduct);
				totalPrice += costCurentOrder;
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not find.");
		} catch (IOException e) {
			System.out.println("Input output exception occurred.");
		}
		DecimalFormat dfDecimalFormat = new DecimalFormat("#.##");
		System.out.println(String.format("%s", dfDecimalFormat.format(totalPrice)));
	}
}
