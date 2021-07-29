package age;

import java.util.Scanner;


public class age {

	public static void main(String args []) {
		
		int age;
		
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
		
		
		if (age >= 15) {
		System.out.println("15세 이상입니다.");
		
	}
		else {
		
	
		
		System.out.println("15세 미만 출입불가입니다.");
	}
	}
}
