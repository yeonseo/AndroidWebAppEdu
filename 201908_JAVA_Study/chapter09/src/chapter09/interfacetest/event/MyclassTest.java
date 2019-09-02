package chapter09.interfacetest.event;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MyclassTest {
   public static void main(String[] args) throws InterruptedException {
      ActionListener actionListner = new Myclass();
      //1.시간타이머로 이벤트를 자동발생시켜보자.
      Timer t=new Timer(1000,actionListner);
      t.start();
      for(int i=0;i<10;i++) {
          Thread.sleep(1000);
      }
   }
}
