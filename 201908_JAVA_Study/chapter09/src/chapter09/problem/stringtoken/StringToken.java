package chapter09.problem.stringtoken;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class StringToken {
	public static Iterator tokenizerList(String str) {
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(str);
		int i=0;
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
			//System.out.println(st.nextToken());
		}
		return list.iterator();
	}
	public static Iterator tokenizerList(String str, String sym) {
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(str,sym);
		int i=0;
		int count = 0;
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
			count++;
			//System.out.println(st.nextToken());
		}
		System.out.println("단어 갯수 : "+count);
		return list.iterator();
	}
	public static String[] tokenizerString(String str, String sym) {
		String[] strArr=new String[3];
		StringTokenizer st = new StringTokenizer(str,sym);
		int i=0;
		int count = 0;
		while (st.hasMoreTokens()) {
			count++;
			strArr[i++]=st.nextToken();
			System.out.println(strArr[i-1]);
			//System.out.println(st.nextToken());
		}
		System.out.println("단어 갯수 : "+count);
		return strArr;
	}
}
