import java.util.Arrays;
import java.util.Scanner;

public class _2_TriangleArea {

	public static Boolean tryParse(String numAsString){
		try {
			Double.parseDouble(numAsString);
			return true;
		} catch (Exception e) {
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
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Please enter coordinates of the three vertices separeated by a single space.");
		System.out.println();
		String vertice;
		double[] coordinates = new double[2];
		
		System.out.print("Enter coordinates: ");
		vertice = scanner.nextLine();
		coordinates = getCoordinates(vertice);
		Point firstPoint = new Point (coordinates);
		
		System.out.print("Enter coordinates: ");
		vertice = scanner.nextLine();
		coordinates = getCoordinates(vertice);
		Point secondPoint = new Point (coordinates);
		
		System.out.print("Enter coordinates: ");
		vertice = scanner.nextLine();
		coordinates = getCoordinates(vertice);
		Point thirdPoint = new Point (coordinates);
		
		Point[] points = new Point[3];
		points[0] = firstPoint;
		points[1] = secondPoint;
		points[2] = thirdPoint;
		Arrays.sort(points);
		
		Triangle triangle = new Triangle(points);
		
		double area = (triangle.getA().getX() * (triangle.getB().getY() - triangle.getC().getY()) +
				triangle.getB().getX() * (triangle.getC().getY() - triangle.getA().getY()) + 
				triangle.getC().getX() * (triangle.getA().getY() - triangle.getB().getY())) / 2;
		
		int output;
		if (area != 0) {
			int areaAbs = (int) Math.abs(area);
			output = areaAbs;
		} else {
			output = 0;
		}
		
		System.out.println(output);
	}

}
