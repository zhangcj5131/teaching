package cn.nuist.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String fileName = "/Users/cjz/data/email_1133_5451.txt";
//		readFileByLines(fileName);
		
//		HashMap<Integer, String> mymap = 
//				new HashMap<Integer, String>();
//		mymap.put(1, "one");
//		mymap.put(2, "two");
//		mymap.put(2, "2222");
//		String str = mymap.get(1);
		
//		visit_map(mymap) ;
		
//		HashSet<Integer> myset = new HashSet<Integer>();
//		myset.add(1);
//		myset.add(2);
//		myset.add(5);
////		System.out.println(myset.size());
//		visit_set(myset) ;
		
		
//		HashMap<Integer, HashSet<Integer>> networkmap = 
//				new HashMap<Integer, HashSet<Integer>>();
		
		String fileName = "/Users/cjz/data/email_1133_5451.txt";
		ArrayList<Integer[]> mylist = readFileByLines(fileName);
//		visit_list(mylist) ;
		
		
		HashMap<Integer, HashSet<Integer>> net_map = 
		get_network(mylist);
		boolean flag = is_connected(net_map,1,200);
		System.out.println(flag);
		
		get_neighbors(net_map,1) ;
	}
	
	private static void get_neighbors(HashMap<Integer, HashSet<Integer>> net_map,
			Integer id) {
		Integer tmp_id = 0;
		HashSet<Integer> tmp_set = net_map.get(id);
		Iterator<Integer> it = tmp_set.iterator();
		while(it.hasNext()) {
			tmp_id = it.next();
			System.out.print(tmp_id + ",");
		}
		
	}
	
	private static boolean is_connected(HashMap<Integer, HashSet<Integer>> net_map,
			Integer id1, Integer id2) {
		return net_map.get(id1).contains(id2);
		
	}
	
	private static void visit_list(ArrayList<Integer[]> mylist) {
		int i = 0;
		int j = 0;
		for(i = 0; i < mylist.size(); i ++) {
			for(j = 0; j < mylist.get(i).length; j ++) {
				System.out.print(mylist.get(i)[j] + ",");
			}
			System.out.println();
		}
	}
	
	
	private static void visit_set(HashSet<Integer> myset) {
		Iterator<Integer> it = myset.iterator();
Integer key = null;
		
		while(it.hasNext()) {
			key = it.next();
			System.out.println(key);
		}
	}
	
	private static void 
	visit_map(HashMap<Integer, String> mymap) {
		
		Iterator<Integer> it = mymap.keySet().iterator();
		Integer key = null;
		
		while(it.hasNext()) {
			key = it.next();
			System.out.println(mymap.get(key));
		}
		
	
	}
	
	
	public static ArrayList<Integer[]> readFileByLines(String fileName) {
		ArrayList<Integer[]> mylist = new ArrayList<Integer[]>();
		File file = new File(fileName);
        Integer[] tmp_array = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
            	    tmp_array = str_to_int_array(tempString);
            	    mylist.add(tmp_array);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return mylist;
    }
	
	
	private static 
	HashMap<Integer, HashSet<Integer>> 
	get_network(ArrayList<Integer[]> mylist){
		
		HashMap<Integer, HashSet<Integer>> net_map = 
				new HashMap<Integer, HashSet<Integer>>();
		
		int i = 0;
		Integer[] tmp_array = null;
		Integer id1 = 0;
		Integer id2 = 0;
		HashSet<Integer> tmp_set = null;
		for(i = 0; i < mylist.size(); i ++) {
			tmp_array = mylist.get(i);
			id1 = tmp_array[0];
			id2 = tmp_array[1];
			
			put_map(net_map,id1, id2);
			put_map(net_map,id2, id1);
			

			
			
		}
		
		return net_map;
	}
	
	
	private static void 
	put_map(HashMap<Integer, HashSet<Integer>> net_map,
			Integer id1, Integer id2) {
		if(net_map.containsKey(id1)) {
			net_map.get(id1).add(id2);
		}else {
			HashSet<Integer> tmp_set = new HashSet<Integer> ();
			tmp_set.add(id2);
			net_map.put(id1, tmp_set);
		}
		
	}
	
	
	private static Integer[] str_to_int_array(String str) {
		String[] str_array = str.split(",");
		Integer id1 = Integer.parseInt(str_array[0]);
		Integer id2 = Integer.parseInt(str_array[1]);
		Integer[] int_array = new Integer[]{id1, id2};
		return int_array;
	}

}
