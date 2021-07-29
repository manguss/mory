package Example;

import java.util.Scanner;

public class SMMD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("두 개의 실수를 입력하세요: ");
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			System.out.println("두 수의 덧셈은" + (a + b));
			System.out.println("두 수의 뺄셈은" + (a - b));
			System.out.println("두 수의 곱셈은" + (a * b));
			System.out.println("두 수의 나눗셈은" + (a / b));
		
	}
	
}
