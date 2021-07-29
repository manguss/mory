package Example;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로,세로 길이를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r= a*b;
		
		System.out.print("사각형의 면적은 " + r + "입니다.");
	}
}
