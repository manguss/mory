package age;

import java.util.Scanner;

public class swtgich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int op1;
		int op2;
		String op;
		op1= scanner.nextInt();
		op= scanner.next();
		op2= scanner.nextInt();
		
		int res;
		switch(op) {
		
		case "+":
			System.out.println(op1+"+"+op2+"�� ����"+(op1+op2)); 
			
			break;
		case "-":
			System.out.println(op1+"-"+op2+"�� ����"+(op1 - op2));
			
			break;
		case "*":
			System.out.println(op1+"*"+op2+"�� ����"+(op1 * op2));
			break;
		case "/":
			if(op2 ==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
		}
	}
}
				
			
				
			
			
			
		
		
	

