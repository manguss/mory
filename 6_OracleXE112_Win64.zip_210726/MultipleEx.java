package Example;

import java.util.Scanner;

public class MultipleEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ���:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int p = a + b;
		int m = a * b;
		
		System.out.println("�� ���� ����: "+ p );
		System.out.println("�� ���� ����: "+ m );
		
		scanner.close();
	}
}
