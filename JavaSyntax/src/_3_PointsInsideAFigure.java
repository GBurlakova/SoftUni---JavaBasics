import java.util.Scanner;

public class _3_PointsInsideAFigure {

	public static Boolean tryParse(String numAsString){
		try {
			Double.parseDouble(numAsString);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static double[] getCoordinates(String vertice){
		double[] coordinates = new double[2];
		String[] auxiliaryArr = new String[2];
		auxiliaryArr = vertice.split(" ");
		if (auxiliaryArr.length < 2) {
			throw new IllegalArgumentException("You have entered only one parameter.");
		}
		if (tryParse(auxiliaryArr[0]) && 
			tryParse(auxiliaryArr[1])) {
			coordinates[0] = Double.parseDouble(auxiliaryArr[0]);
			coordinates[1] = Double.parseDouble(auxiliaryArr[1]);
		} else {
			throw new NumberFormatException("You have entered wrong data.");
		}
		return coordinates;
	}
	
	public static Boolean isInsideLeftRect(Point point){
		double minX = 20;
		double maxX = 22.5;
		double minY = 8.5;
		double maxY = 13.5;
		if (point.getX() >= minX && point.getX() <= maxX &&
			point.getY() >= minY && point.getY() <= maxY) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static Boolean isInsideToptRect(Point point){
		double minX = 12.5;
		double maxX = 22.5;
		double minY = 6;
		double maxY = 8.5;
		if (point.getX() >= minX && point.getX() <= maxX &&
			point.getY() >= minY && point.getY() <= maxY) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean isInsideRightRect(Point point){
		double minX = 12.5;
		double maxX = 17.5;
		double minY = 8.5;
		double maxY = 13.5;
		if (point.getX() >= minX && point.getX() <= maxX &&
			point.getY() >= minY && point.getY() <= maxY) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String coordinatesString = scanner.nextLine();
		double[] coordinates = getCoordinates(coordinatesString);
		Point point = new Point(coordinates);
		String output = "";
		if (isInsideLeftRect(point) || isInsideRightRect(point) || isInsideToptRect(point)) {
			output = "Inside";
		} else {
			output = "Outside";
		}
		System.out.println(output);
	}

}
