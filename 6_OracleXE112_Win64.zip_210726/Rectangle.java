package Example;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����,���� ���̸� �Է��ϼ���: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r= a*b;
		
		System.out.print("�簢���� ������ " + r + "�Դϴ�.");
	}
}
