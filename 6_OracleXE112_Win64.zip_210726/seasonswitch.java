package Example;

import java.util.Scanner;

public class seasonswitch {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12): ");
		
		int n = scanner.nextInt();
		
		switch(n) {
		case 3: case4: case5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		
			default:
			System.out.println("잘못 입력하셨습니다.");
		}
		

	scanner.close();
	
	}
}
