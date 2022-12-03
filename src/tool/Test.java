package tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(9);
		String s = "tharun";
		
		System.out.println(s.length());
		values.add(10);
		values.add(1);
		Comparator<Integer> c = new Comparator<>() {
			public int compare(Integer i, Integer j) {
				return 1;
			}
		};
		Collections.sort(values);
//		System.out.println(values);
		for(Object v: values) {
			System.out.println(v);
		}
	}
}
