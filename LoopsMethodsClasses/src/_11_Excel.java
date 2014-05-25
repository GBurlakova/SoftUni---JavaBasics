import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class _11_Excel {

	public static void createFile(String path, TreeMap<String, Double> treeMap, double total){
		try (FileWriter writer = new FileWriter(path)){
			for (Map.Entry<String, Double> office : treeMap.entrySet()) {
				String city = office.getKey();
				double incomes = office.getValue();
				writer.write(String.format("%s Total -> %.2f", city, incomes));
				writer.write(System.lineSeparator());
			}
			writer.write(String.format("Grand Total -> %.2f", total));
			writer.write(System.lineSeparator());
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		String filePathString = "src" + File.separator + "IOFiles" + File.separator + "Incomes.xlsx";
		TreeMap<String, Double> offices = new TreeMap<String, Double>();
		try(InputStream reader = new FileInputStream(filePathString)){
			XSSFWorkbook workbook = new XSSFWorkbook(reader);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowsCount = sheet.getLastRowNum();
			double grandTotal = 0;
			for (int i = 1; i <= rowsCount; i++) {
				XSSFRow currenRow = sheet.getRow(i);
				String city = currenRow.getCell(0).toString();
				double incomes = currenRow.getCell(5).getNumericCellValue();
				grandTotal += incomes;
				if (offices.containsKey(city)) {
					offices.put(city, offices.get(city) + incomes);
				} else {
					offices.put(city, incomes);
				}
			}
			String fileOutputPath = "src" + File.separator + "IOFiles" + File.separator + "IncomesOutputProblem11.txt";
			createFile(fileOutputPath, offices, grandTotal);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Input output exception occured.");
		}
	}

}
