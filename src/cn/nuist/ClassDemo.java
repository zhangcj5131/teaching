package cn.nuist;

import java.util.ArrayList;

public class ClassDemo {
	public static void main(String[] args) {
		int count = 999999;
		
		ArrayList mylist = new ArrayList();
		mylist.add(1);
		for(int i = 0; i < count; i ++) {
			mylist.add(i);
		}
		
		for(int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		
		}
		
		
	

	}
}
