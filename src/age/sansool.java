package age;

import java.util.Scanner;

public class sansool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int time;
		time = scanner.nextInt();
		int hour = time / (60*60);
		int min = time / 60-(hour*60);
		int sec = time%60;
		
		System.out.println(time+" �ʴ� " + hour + "�ð�," + min + "��,"+ sec + "���Դϴ�."  );
	}
}
