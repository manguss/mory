package Example;

import java.util.Scanner;

public class transEuro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위: 원): ");
		int won;
		won = scanner.nextInt();
		double dol=1200;
		double eur=1500;
		
		System.out.println(won+"원은 $"+ won /dol + "입니다.");
		System.out.println(won+"원은 E"+ won /eur + "입니다.");
		
		scanner.close();
	}
}
