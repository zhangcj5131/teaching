package cn.nuist;

import java.util.HashMap;
import java.util.Iterator;

public class HaspMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mymap = new HashMap();
		
		System.out.println(mymap.size());
		String name1 = "zhangsan";
		String name2 = "lisi";
		mymap.put(name1, 90);
		mymap.put(name2, 95);
		System.out.println(mymap.size());
		showMap(mymap) ;
		
		System.out.println("------------------");
		mymap.put(name2, 100);
		System.out.println(mymap.size());
		
		showMap(mymap) ;

	}
	
	private static void showMap(HashMap mymap) {
		Iterator it = mymap.keySet().iterator();
		Object key = null;
		Object value = null;
		while(it.hasNext()) {
			key = it.next();
			value = mymap.get(key);
			System.out.println("key = " + key + ",score = " + value);
			
		}
		
	}

}
