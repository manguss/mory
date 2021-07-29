package Example;

import java.util.Scanner;

public class Pie {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int a;
	double b = 3.14;
	System.out.println("반지름을 입력하세요: ");
	
	a = scanner.nextInt();
	System.out.println("원의 면적은 " + a*a*b + "입니다");
	
//	scanner.close();
}

}
