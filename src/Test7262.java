

import java.util.Scanner;

public class Test7262 {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String input = "Myongji60";
      System.out.println("��ȣ�� �Է��ϼ���: ");
      int trynumber = 1;
      
      for(int i = 0; i<trynumber; i++){
      
         if(trynumber == 4){
            System.out.println("������ �ź��մϴ�.");
         }else{
            String password = scanner.nextLine();
               if(input.equals(password)) {
                  System.out.println("ȯ���մϴ�.");
                  i = 5;
               }else {
                  trynumber++;
                  System.out.println("��ȣ�� Ʋ���ϴ�.");
               }
            }
      }
}
}