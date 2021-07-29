package age;

import java.util.Scanner;

public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요(10~99): ");
		int n = scanner.nextInt();
		int count = 0;
		int a,b;
		a= n / 10;
		b = n % 10;
		
		if(a % 3 == 0) {
			count++;
		}
			if (b % 3 == 0 && b!= 0 ) {
				count++;
				
			}
			if(count == 2) {
				System.out.println("박수짝짝");
			}else if (count == 1) {
				System.out.println("박수짝");
	        }else {
		        System.out.println("박수없음");
			}
		}
}

		
		