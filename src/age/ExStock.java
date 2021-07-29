package age;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("코스피 지수를 입력하세요(1800~2500): ");
		int a;
		a= scanner.nextInt();
		int b;
		System.out.println("환율을 입력하세요(1100~1200:) " );
		b = scanner.nextInt();
		
		if(b < 1150  ) {
			if (a >= 2300) {
				System.out.println("상승장");
			
		}else if(a >= 2000) {
				System.out.println("횡보장");
		} else {
			System.out.println("하락장");
		}
		}else {
			if (a >= 2200) {
				System.out.println("상승장");
			}else if(a >=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}
			}
		}
		}
				