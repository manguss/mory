package Example;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수 3개를 입력하시오: ");
	int a, b, c;
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	
	if((a+ b)<=c || (b+c)<= a || (c+a)<=b) {
		System.out.println("삼각형을 만들 수 없습니다.");
}  else {
		System.out.println("삼각형이 됩니다");
	}
		
	}
}

