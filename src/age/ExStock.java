package age;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ڽ��� ������ �Է��ϼ���(1800~2500): ");
		int a;
		a= scanner.nextInt();
		int b;
		System.out.println("ȯ���� �Է��ϼ���(1100~1200:) " );
		b = scanner.nextInt();
		
		if(b < 1150  ) {
			if (a >= 2300) {
				System.out.println("�����");
			
		}else if(a >= 2000) {
				System.out.println("Ⱦ����");
		} else {
			System.out.println("�϶���");
		}
		}else {
			if (a >= 2200) {
				System.out.println("�����");
			}else if(a >=2000) {
				System.out.println("Ⱦ����");
			}else {
				System.out.println("�϶���");
			}
			}
		}
		}
				