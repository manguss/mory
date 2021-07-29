package age;

import java.util.Scanner;

public class swtgich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산: ");
		int op1;
		int op2;
		String op;
		op1= scanner.nextInt();
		op= scanner.next();
		op2= scanner.nextInt();
		
		int res;
		switch(op) {
		
		case "+":
			System.out.println(op1+"+"+op2+"의 값은"+(op1+op2)); 
			
			break;
		case "-":
			System.out.println(op1+"-"+op2+"의 값은"+(op1 - op2));
			
			break;
		case "*":
			System.out.println(op1+"*"+op2+"의 값은"+(op1 * op2));
			break;
		case "/":
			if(op2 ==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
		}
	}
}
				
			
				
			
			
			
		
		
	

