import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintTheCurrentDateAndTime {

	public static void main(String[] args){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE");
		String localDateTime = LocalDateTime.now().format(format);
		System.out.println(localDateTime);
		
	}

}
