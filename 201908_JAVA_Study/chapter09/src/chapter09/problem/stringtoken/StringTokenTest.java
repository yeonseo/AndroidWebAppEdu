package chapter09.problem.stringtoken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import chapter09.interfacetest.compareto.Person;

public class StringTokenTest{

	public static <T> void main(String[] args) {
		StringToken st = new StringToken();
		Iterator<String> list = st.tokenizerList("010-9991-9092","-");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("input : ");
		String input = scan.nextLine();
		System.out.print("symbol : ");
		String symbol = scan.next();
		list = st.tokenizerList(input,symbol);
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		scan = new Scanner(System.in);
		System.out.print("input : ");
		input = scan.next();
		System.out.print("symbol : ");
		symbol = scan.next();
		String[] array = StringToken.tokenizerString(input,symbol);
		Arrays.sort(array);
		for(String i : array) {
			System.out.println(i);
		}
	}
}
