package Example;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3�ڸ� ������ �Է��ϼ���(100~999): ");
		int n =scanner.nextInt();
		int h = n/100;
		int hr= n%100;
		int t =hr/10;
		int o = hr%10;
		
		int sum = h+ t;
		int mt = t * o;
		
		System.out.println("100�� �ڸ��� 10�� �ڸ��� ����"+sum);
		System.out.println("10�� �ڸ��� 1�� �ڸ��� ����"+mt);
		
		
	}
}
		
		
