package collections;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
		b.put(100, 1000);
		b.put(200, 2000);
		b.put(300, 3000);
		b.put(400, 4000);
		System.out.println(b.get(100));
		System.out.println(b.get(200));
		System.out.println(b.get(300));
		
		HashMap<Integer, String> c = new HashMap<Integer, String>();
		c.put(1, "하나");
		c.put(2, "둘");
		c.put(3, "셋");
		c.put(4, "넷");
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
	}

}
