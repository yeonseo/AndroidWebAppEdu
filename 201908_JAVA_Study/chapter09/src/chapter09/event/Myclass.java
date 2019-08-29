package chapter09.event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myclass implements ActionListener{
   private int count =0;
   //이벤트가 발생하면 불러지는 함수다.
   //매개변수는 이벤트가 발생이되면 발생이 될때 모든정보를  객체로 만들어서
   //ActionEvent event = 객체<<<   전달....
   public void actionPerformed(ActionEvent event) {
      //이벤트가 발생이 되었을떄 해야될 일을 적으면 됨.      
      System.out.println((count++)+"beep");
   }
}
