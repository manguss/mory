package age;

import java.util.Scanner;
import java.util.*;

public class ifssmd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int a;
		int b;
		String c;
		a= scanner.nextInt();
		c= scanner.next();
		b= scanner.nextInt();
		
		
		int res = 0;
		
		if(c.equals("+")) {
			res = a + b;
		} else if (c.equals("-")) {
			res = a - b;
		}else if (c.equals("*")) {
			res = a* b;
		}else if (c.equals("/")) {
			if(b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}else {
				res = a / b;
			}
		}else {
			System.out.println("��Ģ������ �ƴմϴ�.");
			scanner.close();
			return;
		}
		System.out.println(a + c + b + "�� ���ɰ���"+res);
		scanner.close();
		
	}
	
}
