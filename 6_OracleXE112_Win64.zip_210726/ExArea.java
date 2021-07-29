package Example;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		
		int a,b,c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(c == 0 ) {
			float triangle = (a * b) / 2;
			System.out.println("삼각형의 넓이는"+ triangle);
		} else {
			
		float trapezium = (a + b) * c / 2;
			System.out.println("사다리꼴의 넓이는"+ trapezium);
		}
		scanner.close();
	}
}

