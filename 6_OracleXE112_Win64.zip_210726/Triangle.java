package Example;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("���� 3���� �Է��Ͻÿ�: ");
	int a, b, c;
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	
	if((a+ b)<=c || (b+c)<= a || (c+a)<=b) {
		System.out.println("�ﰢ���� ���� �� �����ϴ�.");
}  else {
		System.out.println("�ﰢ���� �˴ϴ�");
	}
		
	}
}

