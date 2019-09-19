package chapter17.problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserDataTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<Integer, User> map = new HashMap<Integer, User>();
		putMap(map);
		save(map);
		print();
	}
	
	public static void putMap(Map<Integer, User> map) {
		map.put(1, new User("남영기","010-5252-5252","0ki_ZZang@naver.com"));
		map.put(2, new User("정미선","010-5252-5252","missunny@daum.net"));
		Scanner scan = new Scanner(System.in);
		System.out.print("몇명을 입력하시겠습니까? : ");
		int num = scan.nextInt();
		for(int i = 0 ; i < num ; i++) {
			System.out.print("이름을 입력하세요 : "); String name = scan.next();
			System.out.print("전화번호를 입력하세요 : "); String phone = scan.next();
			System.out.print("메일을 입력하세요 : "); String email = scan.next();
			int index = map.size()+1;
			map.put(index, new User(name, phone, email));
		}
	}
	
	public static void save(Map<Integer, User>map) throws IOException {
		File file = new File("Object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(map);
		if(oos!=null) { oos.close(); }
		System.out.println("Done!");
	}
	public static void print() throws IOException, ClassNotFoundException {
		File file = new File("Object.dat");
		
		FileInputStream fis=new FileInputStream(file);
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Map<Integer, User>map =(Map<Integer, User>)ois.readObject();
	    String choice="";
		for(Map.Entry<Integer, User> elem : map.entrySet()){
            Integer key = elem.getKey();  User value = elem.getValue();
            System.out.println(key+" : "+value);
            if(key == 1 || key == 2 ||key == 3) {
            	choice+="Choice "+key+" : "+value+"\n";
            }
        }
		System.out.println(choice);
	}
}

//
//package quiz8;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class Quiz8 {
//   public static Scanner sc = new Scanner(System.in);
//
//   public static void main(String[] args) throws Exception {
//      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("infomation.txt"));
//      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("infomation.txt"));
//      ArrayList<User> list = new ArrayList<User>();
//      int no = 1;
//      while (true) {
//         System.out.print("이름 입력 요망: ");
//         String name = sc.nextLine();
//         System.out.print("전화번호 입력 요망: ");
//         String phone = sc.nextLine();
//         System.out.print("이메일 입력 요망: ");
//         String email = sc.nextLine();
//         list.add(new User(no, name, phone, email));
//         no++;
//         System.out.print("추가 입력하시겠습니까(y/n)? ");
//         String go = sc.nextLine();
//         if (go.equals("N") || go.equals("n")) {
//            break;
//         }
//      }
//      oos.writeObject(list);
//      if (oos != null) {
//         oos.close();
//      }
//      // 역직렬화
//      ArrayList<User> list2 = (ArrayList<User>) ois.readObject();
//
//      Iterator<User> iter = list2.iterator();
//      boolean find = false;
//      while (iter.hasNext()) {
//         User user = iter.next();
//         if (user.number == 2) {
//            System.out.println(user);
//            find = true;
//            break;
//         }
//      }//end of while
//      if(find==false) {
//         System.out.println("찾지 못했습ㄴ디ㅏ.");
//      }
//      if(ois!=null) {
//         ois.close();
//      }
//   }
//}