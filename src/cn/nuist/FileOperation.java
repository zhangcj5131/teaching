package cn.nuist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		String fileName = "/Users/cjz/data/email_1133_5451.txt";	
		ArrayList<Integer[]> mylist = readFile(fileName);

		
		HashMap<Integer, HashSet<Integer>> relation_map 
		= build_relationship(mylist);
		
		
		visit_set(relation_map.get(2));
		
//		System.out.println(is_connected(relation_map,
//				1,100));
		
		
		HashSet<Integer> visited_set = new HashSet();
		
		 visit_net(relation_map,visited_set, 1134);
		 System.out.println(relation_map.size());
			System.out.println(visited_set.size());
		
		
	

	}
	
	
	private static void visit_net(HashMap<Integer, HashSet<Integer>> relation_map,
			HashSet<Integer> visited_set, Integer id) {
		if(!visited_set.contains(id)) {
			visited_set.add(id);
			HashSet<Integer> tmpSet = relation_map.get(id);
			Iterator<Integer> it = tmpSet.iterator();
			Integer tmp_id = 0;
			while(it.hasNext()) {
				tmp_id = it.next();
				visit_net(relation_map,visited_set, tmp_id);
			}
			
		}
		
		
	}
	
	
	
	
	private static boolean is_connected(HashMap<Integer, HashSet<Integer>> relation_map,
			Integer id1, Integer id2) {
		return relation_map.get(id1).contains(id2);
	}
	
	private static void visit_set(HashSet<Integer> myset) {
		Iterator<Integer> it = myset.iterator();
		Integer id = 0;
		while(it.hasNext()) {
			id = it.next();
			System.out.print(id + ",");
		}
		System.out.println();
	}
	
	
	private static HashMap<Integer, HashSet<Integer>> 
	                      build_relationship(ArrayList<Integer[]> mylist){
		HashMap<Integer, HashSet<Integer>> relation_map = 
				new HashMap<Integer, HashSet<Integer>>();
		Integer[] myArray = null;
		HashSet<Integer> myset = null;
		Integer id1 = 0;
		Integer id2 = 0;
		for(int i = 0; i < mylist.size(); i ++) {
			myArray = mylist.get(i);
			id1 = myArray[0];
			id2 = myArray[1];
			inster_value( relation_map,  id1,  id2);
			inster_value( relation_map,  id2,  id1);			
		}
		return relation_map;
	}
	
	private static void inster_value(HashMap<Integer, HashSet<Integer>> relation_map,
			Integer id1, Integer id2) {
		HashSet<Integer> myset = null;
		if(!relation_map.containsKey(id1)) {
			myset = new HashSet<Integer>();
			myset.add(id2);
			relation_map.put(id1, myset);					
		}else {
			//relation_map.get(id1).add(id2);
			myset = relation_map.get(id1);
			myset.add(id2);
		}
		
	}
	

	public static ArrayList<Integer[]> readFile(String fileName) throws IOException {
		File file = new File(fileName);
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));

		ArrayList<Integer[]> mylist = new ArrayList<Integer[]>();
		
		String tempString = null;
		String[] strArray = null;
		Integer[] integerArray = null;
		while ((tempString = reader.readLine()) != null) {
			strArray = tempString.split(",");
//			System.out.println(strArray[0] + ":" +strArray[1] );
			
			integerArray = stringArrayToIntegerArray(strArray);
			
			//System.out.println(integerArray[0] + ":" +integerArray[1] );
			mylist.add(integerArray);
		}

		reader.close();
		return mylist;
	}
	
	private static Integer[] 
			stringArrayToIntegerArray(String[] strArray) {
		Integer node1 = Integer.parseInt(strArray[0]);
		Integer node2 = Integer.parseInt(strArray[1]);

		Integer[] intArray = {node1, node2};
		
		return intArray;
	}
	

}
