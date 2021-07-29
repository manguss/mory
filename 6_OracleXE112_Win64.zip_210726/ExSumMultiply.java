package Example;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3자리 정수를 입력하세요(100~999): ");
		int n =scanner.nextInt();
		int h = n/100;
		int hr= n%100;
		int t =hr/10;
		int o = hr%10;
		
		int sum = h+ t;
		int mt = t * o;
		
		System.out.println("100의 자리와 10의 자리의 합은"+sum);
		System.out.println("10의 자리와 1의 자리의 곱은"+mt);
		
		
	}
}
		
		
