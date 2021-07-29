package Example;

import java.util.Scanner;

public class elfe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)");
		
		int n;
		n = scanner.nextInt();
		
		if(3 <= n && 5>=n) {
			System.out.println("봄");
		}else if(6<=n&& 8>=n) {
				System.out.println("여름");
		}else if(9<=n && 11>=n) {
				System.out.println("가을");
		}else if(n == 1 || n == 2 || n == 12) {
				System.out.println("겨울");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		scanner.close();
	}
}
