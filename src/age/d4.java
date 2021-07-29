package age;

import java.util.Scanner;

public class d4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매금액을 입력하세요");
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
		System.out.println("구매금액= "+ pur);
		System.out.println("청구금액= "+ bal);
		
	}
	

	}
