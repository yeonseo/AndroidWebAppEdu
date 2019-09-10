package chapter15.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {
   public static void main(String[] args) {
      //1.arraylist integer 선언
      List<Integer> al=new ArrayList<Integer>();
      //2.랜덤값으로 1~100사이를 100개 입력!
      for(int i=0;i<10000;i++) {
         al.add((int)(Math.random()*(10000-1+1)+1));
         System.out.print(al.get(i)+" ");
      }
      long start1=System.nanoTime(); //속도 비교!
      for(int i=0;i<10000;i++) {
         if(al.get(i)==50) break;
      
      }
      long stop1=System.nanoTime(); //속도비교!
      System.out.println("\n 일반방법검색처리시간 = "+(stop1-start1));
      
      //3.정렬시킬것! (정렬이 안되면 찾을수 없음)
      System.out.println();
      Collections.sort(al);
      for(Integer i : al) {
         System.out.print( i + " ");
      }
      long start=System.nanoTime(); //속도비교
      int index=Collections.binarySearch(al, 10);
      long stop=System.nanoTime(); //속도비교
      System.out.println("\n"+index+"   "+(stop-start));

   }

}
