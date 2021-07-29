package age;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pur;
		int sel;
		double result;
		
		System.out.println("매수금액을 입력하세요: ");
		pur = scanner.nextInt();
		System.out.println("매도금액을 입력하세요: ");
		sel = scanner.nextInt();
		
		if(sel > pur ) {
			result = (sel - pur) * 0.22;
		}else {
			result = 0;
		}
		System.out.println("양도세:"+result);
	}
}
