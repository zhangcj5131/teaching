package cn.nuist;

import java.util.HashMap;

public class HashMapGeneralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mymap = new HashMap();
		mymap.put(1, "lisi");
		mymap.put("asdf", 3.14);
		Object name = mymap.get(1);
		
		HashMap<Integer, String> mymap1 = new HashMap<Integer, String>();
		mymap1.put(1, "lsi");
//		mymap1.put("asdf", 3.14);
		



	}

}
