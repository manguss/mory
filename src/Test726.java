import java.util.Scanner;
public class Test726 {


	public class test726 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("원뿔 밑의 원의 반지름을 입력하세요: ");
			double radius = scanner.nextDouble();
			
			System.out.println("원뿔의 높이를 입력하세요: ");
			double height = scanner.nextDouble();
			
			
			double volume = radius * radius * height *  1.0/3.0 * Math.PI;
			
			System.out.println("원뿔 밑의 원의 반지름: "+ radius);
			System.out.println("원뿔의 높이: "+height);
			System.out.println("원뿔의 부피: "+volume);
			
			scanner.close();
		}
	}
			


}
