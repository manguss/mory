package Example;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		
		int fare = 0;
		int income = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i =0; i < 10; i++) {
			System.out.println("����� �Է��ϼ���:: ");
			
			fare = scanner.nextInt();
			income = income + fare;
			
		}
		System.out.println("�� ����: "+income);
		scanner.close();
		
			
			
			
			
	
			
		}
}


