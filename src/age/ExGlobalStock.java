package age;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pur;
		int sel;
		double result;
		
		System.out.println("�ż��ݾ��� �Է��ϼ���: ");
		pur = scanner.nextInt();
		System.out.println("�ŵ��ݾ��� �Է��ϼ���: ");
		sel = scanner.nextInt();
		
		if(sel > pur ) {
			result = (sel - pur) * 0.22;
		}else {
			result = 0;
		}
		System.out.println("�絵��:"+result);
	}
}
