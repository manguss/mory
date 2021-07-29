package Example;

import java.util.Scanner;

public class MultipleEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int p = a + b;
		int m = a * b;
		
		System.out.println("두 수의 합은: "+ p );
		System.out.println("두 수의 곱은: "+ m );
		
		scanner.close();
	}
}
