public class ParseNumbers {
	
	public static boolean tryParseInt(String numAsString){
		try {
			Integer.parseInt(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean tryParseFloatingPoint(String numAsString){
		try {
			Float.parseFloat(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean tryParseDouble(String numAsString){
		try {
			Double.parseDouble(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
