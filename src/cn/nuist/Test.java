package cn.nuist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer i = 14;
//		Integer j = 14;
//		System.out.println(i == j);
//		System.out.println(i.equals(j));
		 
		

		
//		Integer i = 1;
//		Integer j = new Integer(1);
//		System.out.println(i == j);
//		System.out.println(i.equals(j));
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
		
//		Point p1 = new Point(1,1);
//		Point p2 = new Point(1,1);
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
		
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(2,2);

//		List<Point> pList = new ArrayList<Point>();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(p3);
//		pList.add(p4);
//         System.out.println(pList.size());	
         
   
         
//		Set<Point> myset = new HashSet<Point>();
//		myset.add(p1);
//		myset.add(p2);
//		myset.add(p3);
//		myset.add(p4);
//		System.out.println(myset.size());


//		HashMap<Point, Integer> testmap = 
//				new HashMap<Point, Integer>();
//		testmap.put(p1, 1);
//		System.out.println(testmap.get(p1));
//		p1.y = 100;
//		System.out.println(testmap.get(p1));
		
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		

		

	}

}
