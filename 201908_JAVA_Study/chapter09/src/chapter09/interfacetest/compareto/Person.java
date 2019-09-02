package chapter09.interfacetest.compareto;

public class Person implements Comparable{
	private String name;
	private double length;
	
	public Person(String name, double length) {
		this.name=name;
		this.length=length;
	}
	public String getName() {return this.name;}
	public double getLength() {return this.length;}
	
   public int compareTo(Object obj) {
      Person person=null;
      int getValue=0;
      if(obj instanceof Person) {
          person=(Person)obj;
          if(this.length > person.length) {
        	  getValue= 1;
          }else if(this.length==person.length) {
        	  getValue= 0;
          }else {
        	  getValue= -1;
          }
      }
      return getValue;
	}
}
//   package chapter09.interfacetest.compareto;
//
//   import java.util.ArrayList;
//   import java.util.Collections;
//   import java.util.Comparator;
//   import java.util.HashMap;
//   import java.util.Map.Entry;
//   import java.util.StringTokenizer;
//
//   public class Person implements Comparable{
//   	private String name;
//   	private String length;
//   	
//   	public Person(String name, String length) {
//   		this.name=name;
//   		this.length=length;
//   	}
//   	public String getName() {return name;}
//   	public String getLength() {return length;}
//   	
//      public int compareTo(Object obj) {
//         Person person=null;
//         if(obj instanceof Person) {
//             person=(Person)obj;
//             if(this.length < person.length) {
//                return 1;
//             }else if(this.length==person.length) {
//                return 0;
//             }else {
//                return -1;
//             }
//         }
//         return 0;
//   		   
//   	
//   	public void comparaTo(Object[] other) {
//   		Person person;
//   		String returnValue;
//   		HashMap<String, String> map = new HashMap<String, String>();
//   		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
//   		for (int i = 0 ; i < other.length ; i++) {
//   			if (other[i] instanceof Person) {
//   				System.out.println("ok");
//   				person = (Person) other[i];
//   				map.put(person.getLength(),person.getName());
//   				list.add(map);
//   			}
//   		}
//   		
//           Collections.sort(list, new Comparator<HashMap<String,String>>() {
//
//   			@Override
//   			public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
//   				return o1.get("value").compareTo(o2.get("value"));
//   			}
//           });
//           for(int i = 0; i < list.size(); i++){
//               System.out.println("list 순서 " + i + "번쨰");
//               for( Entry<String, String> elem : list.get(i).entrySet() ){
//                   // list 각각 hashmap받아서 출력합니다.
//                   System.out.println( String.format("이름 : %s, 키 : %s", elem.getValue(), elem.getKey()) );
//               }
//           }
//   	}
//   }
