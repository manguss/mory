package age;

import java.util.Scanner;

public class sansool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int time;
		time = scanner.nextInt();
		int hour = time / (60*60);
		int min = time / 60-(hour*60);
		int sec = time%60;
		
		System.out.println(time+" 초는 " + hour + "시간," + min + "분,"+ sec + "초입니다."  );
	}
}
