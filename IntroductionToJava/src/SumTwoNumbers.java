import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		
		while (true){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number: ");
				int firstNum = sc.nextInt();
				System.out.print("Enter a number: ");
				int secondNum = sc.nextInt();
				int sum = firstNum + secondNum;
				System.out.printf("The sum is: %s", sum);
				break;
			}catch(InputMismatchException e){
				System.out.println("Please enter correct input.");
				continue;
			}
		}
	}

}
