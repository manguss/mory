package Example;

import java.util.Scanner;

public class Exrentangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ�: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((100<=x && 200>=x) && (100<=y && 200>=y)) { 
		System.out.println("("+x+","+""+y+")" +"�� �簢�� �ȿ� �ֽ��ϴ�.");
		
		}else {
			System.out.println("("+x+","+""+y+")"  +"�� �簢�� �ȿ� �����ϴ�.");
		}
			scanner.close();
			
		}
	}

