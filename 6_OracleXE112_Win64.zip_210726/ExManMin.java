package Example;

import java.util.Scanner;

public class ExManMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int max;
		int min;
		
		if(a > b && a > c) {
			max = a;
		}else if(b> c && b > a) {
			max = b;
			
		}else {
			max = c;
		}
			
			if (a < b && a < c) {
				min = a;
			}else if ( b < c && b < a) {
				min = b;
			}else {
				min = c;
			}
				System.out.println("최대값은"+max);
				System.out.println("최소값은"+min);
		
		
		
		
		
		
		}
		
				}
		
	

