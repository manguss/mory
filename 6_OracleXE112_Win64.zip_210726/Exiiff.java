package Example;

import java.util.Scanner;

public class Exiiff {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("3개의 정수를 입력: ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();		
	int c = scanner.nextInt();

	int me;
	
	if((a>b && a<c) || (a>c && a< b)) {
		me = a;
       }else if ((b>c && b<a) || (b>a && b<c)) {
	     me = b;
       }else {
    	   me = c;
       }
	System.out.println("중간 값은"+me);
}


}
	
