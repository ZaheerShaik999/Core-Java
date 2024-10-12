package NEWN;
import java.util.Scanner;

public class switchbreak {







	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any value : ");
//		int anyNumber = scanner.nextInt();
//		
//		if(anyNumber == 10) {
//			System.out.println("The Number enterted is: " +  anyNumber);
//		}else if (anyNumber == 20) {
//			System.out.println("The Number enterted is: " +  anyNumber);
//		}else if (anyNumber == 30) {
//			System.out.println("The Number enterted is: " +  anyNumber);
//		}else if (anyNumber == 40) {
//			System.out.println("The Number enterted is: " +  anyNumber);
//		}else {
//			System.out.println("The Number enterted is not in range: " +  anyNumber);
//		}
//		scanner.close();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int anyNumber = scanner.nextInt();
		switch (anyNumber) {
		case 10:
			System.out.println("The Number enterted is: " +  anyNumber);
			break;
		case 20:
			System.out.println("The Number enterted is: " +  anyNumber);
			break;

		case 30:
			System.out.println("The Number enterted is: " +  anyNumber);
			break;

		case 40:
			System.out.println("The Number enterted is: " +  anyNumber);
			break;

		default:
			System.out.println("The Number enterted is not in range: " +  anyNumber);
			break;
		}
		scanner.close();
		
		

	}
}
