package Example;

import java.util.Scanner;

public class elfe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(1~12)");
		
		int n;
		n = scanner.nextInt();
		
		if(3 <= n && 5>=n) {
			System.out.println("��");
		}else if(6<=n&& 8>=n) {
				System.out.println("����");
		}else if(9<=n && 11>=n) {
				System.out.println("����");
		}else if(n == 1 || n == 2 || n == 12) {
				System.out.println("�ܿ�");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();
	}
}
