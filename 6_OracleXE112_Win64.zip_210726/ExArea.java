package Example;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		
		int a,b,c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(c == 0 ) {
			float triangle = (a * b) / 2;
			System.out.println("�ﰢ���� ���̴�"+ triangle);
		} else {
			
		float trapezium = (a + b) * c / 2;
			System.out.println("��ٸ����� ���̴�"+ trapezium);
		}
		scanner.close();
	}
}

