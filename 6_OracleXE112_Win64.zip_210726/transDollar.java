package Example;

import java.util.Scanner;

public class transDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double d = 1100;
		int w;
		System.out.print("��ȭ�� �Է��ϼ���(����: ��): ");
		
		w= scanner.nextInt();
		System.out.println(w + "���� " + "$"+ w / d + "�Դϴ�.");
//		scanner.close();
	}
}

