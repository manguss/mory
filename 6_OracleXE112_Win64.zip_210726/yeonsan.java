package Example;

import java.util.Scanner;

public class yeonsan {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(10~99): ");
		int a;
		a= scanner.nextInt();
		
		if(a / 10 == a % 10) {
			System.out.println("Yes!10�� �ڸ��� 1�� �ڸ��� ���� �����ϴ�.");
		}else {
			System.out.println("NO!10�� �ڸ��� 1�� �ڸ��� ���� ���� �ʽ��ϴ�.");
			
			
			
		}
}
}
