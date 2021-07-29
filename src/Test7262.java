

import java.util.Scanner;

public class Test7262 {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String input = "Myongji60";
      System.out.println("암호를 입력하세요: ");
      int trynumber = 1;
      
      for(int i = 0; i<trynumber; i++){
      
         if(trynumber == 4){
            System.out.println("접속을 거부합니다.");
         }else{
            String password = scanner.nextLine();
               if(input.equals(password)) {
                  System.out.println("환영합니다.");
                  i = 5;
               }else {
                  trynumber++;
                  System.out.println("암호가 틀립니다.");
               }
            }
      }
}
}