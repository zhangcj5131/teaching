package cn.nuist;

import java.util.ArrayList;

public class ArraListGeneralTest {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		
		mylist.add(1);
		
		mylist.add("lisi");
		
		for(int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		
//		int index1 = mylist.get(0);
//		String mystr = mylist.get(1);
		
		ArrayList<Integer> mylist1 = new ArrayList<Integer>();
		
		mylist1.add(1);
//		mylist1.add("lisi");
		Integer index2 = mylist1.get(0);

	}

}
