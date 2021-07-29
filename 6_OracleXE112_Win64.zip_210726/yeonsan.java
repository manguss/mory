package Example;

import java.util.Scanner;

public class yeonsan {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요(10~99): ");
		int a;
		a= scanner.nextInt();
		
		if(a / 10 == a % 10) {
			System.out.println("Yes!10의 자리와 1의 자리의 값이 같습니다.");
		}else {
			System.out.println("NO!10의 자리와 1의 자리의 값이 같지 않습니다.");
			
			
			
		}
}
}
