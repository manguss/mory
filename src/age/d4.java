package age;

import java.util.Scanner;

public class d4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���űݾ��� �Է��ϼ���");
		int pur;
		int bal;
		pur = scanner.nextInt();
		
		
		if(pur >=300000) {
			bal = pur - 30000;
		}else if (pur >= 100000) {
			bal = pur -5000;
	     }else{
		    bal = pur;
		}
		System.out.println("���űݾ�= "+ pur);
		System.out.println("û���ݾ�= "+ bal);
		
	}
	

	}
