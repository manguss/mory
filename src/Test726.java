import java.util.Scanner;
public class Test726 {


	public class test726 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("���� ���� ���� �������� �Է��ϼ���: ");
			double radius = scanner.nextDouble();
			
			System.out.println("������ ���̸� �Է��ϼ���: ");
			double height = scanner.nextDouble();
			
			
			double volume = radius * radius * height *  1.0/3.0 * Math.PI;
			
			System.out.println("���� ���� ���� ������: "+ radius);
			System.out.println("������ ����: "+height);
			System.out.println("������ ����: "+volume);
			
			scanner.close();
		}
	}
			


}
