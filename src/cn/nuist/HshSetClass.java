package cn.nuist;

import java.util.HashSet;
public class HshSetClass {

	public static void main(String[] args) {
		HashSet  myset = new HashSet();
		
		System.out.println(myset.size());
		
		myset.add("zhangsan");
		myset.add("zhangsan");
		System.out.println(myset.size());
	}

}
