package Example;

import java.util.Scanner;

public class transEuro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(����: ��): ");
		int won;
		won = scanner.nextInt();
		double dol=1200;
		double eur=1500;
		
		System.out.println(won+"���� $"+ won /dol + "�Դϴ�.");
		System.out.println(won+"���� E"+ won /eur + "�Դϴ�.");
		
		scanner.close();
	}
}
