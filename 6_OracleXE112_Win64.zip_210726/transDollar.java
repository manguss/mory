package Example;

import java.util.Scanner;

public class transDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double d = 1100;
		int w;
		System.out.print("원화를 입력하세요(단위: 원): ");
		
		w= scanner.nextInt();
		System.out.println(w + "원은 " + "$"+ w / d + "입니다.");
//		scanner.close();
	}
}

