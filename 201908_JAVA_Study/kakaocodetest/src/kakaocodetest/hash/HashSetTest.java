package kakaocodetest.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;


public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		hs.add("AAAA");
		hs.add("BBBB");
		hs.add("CCCC");
		hs.add("DDDD");
		hs2.add("DDDD");
		hs2.add("EEEE");
		hs2.add("FFFF");
		getPrint(hs);
		
		HashSet<String> hs2AddAll = new HashSet<String>(hs2);
		HashSet<String> hs2retain = new HashSet<String>(hs2);
		HashSet<String> arrHash = new HashSet<String>();
		System.out.println("addAll");
		hs2AddAll.addAll(hs);
		getPrint(hs2AddAll);
		
		System.out.println("retain");
		//hs2retain.retainAll(hs);
		hs2retain.removeAll(hs);
		String str222 = hs2retain.toString();
		System.out.println(str222);
		
		String[] arr1 = {"D","B","C","A"};
		//String[] arr2 = {"A","B","C"};
		String[] arr2 = {"C","B","A"};

		System.out.println("Test!!!!!!!!!!");
		//System.out.println(solution3(arr1, arr2));
		System.out.println(solution4(arr1, arr2));
		
		
	}

	public static String getPrint(HashSet<String> t) {
//In case Set's, can't print using for()
//		for(int i=0 ; i < hs.size() ; i++) {
//		 t...	
//		}
		String str = null;
		Iterator<String> itr = t.iterator();
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		return str;
	}
	
	 public static String solution(String[] participant, String[] completion) {
		    String answer = "";
	        HashSet<String> participantHS = new HashSet<String>();
			HashSet<String> completionHS = new HashSet<String>();
	        for(String i : participant){
	            participantHS.add(i);
	        }
	        for(String i : completion){
	            completionHS.add(i);
	        }
	        
	        participantHS.removeAll(completionHS);
	        
	        Iterator<String> itr = participantHS.iterator();
	        while(itr.hasNext()) {
	        		answer = itr.next();
			}
	        //if(answer==null) 
		    return answer;
		}
	 public static String solution2(String[] participant, String[] completion) {
	    String answer = "";
        HashMap<String,Integer> participantHS = new HashMap<String,Integer>();
        int count=0;
        for(String i : participant){	
        	for(String j : completion){
                if(i==j) {
                    count++;
                }
            }
        	participantHS.put(i,count);
            count=0;
        }
        
        for(Entry<String, Integer> set : participantHS.entrySet()) {
        	count = set.getValue();
        	System.out.println(count);
        	if(count!=1) answer = set.getKey();
		}
	    return answer;
	 }
	 public static String solution3(String[] participant, String[] completion) {
		String answer = "";
		List<String> participantList = new ArrayList();
		//List<String> completionList = null;
		for(String i : participant){	
			participantList.add(i);
		}
		for(String i : completion){	
			participantList.remove(i);
		}
		
		Iterator<String> iterator = participantList.iterator(); 
		while (iterator.hasNext()) { 
			answer = iterator.next(); 
		}

		return answer;
		
		//통과는 지만 시간초과 
	}
	 public static String solution4(String[] participant, String[] completion) {
		 //Map
		 return null;
	 }
	
}
