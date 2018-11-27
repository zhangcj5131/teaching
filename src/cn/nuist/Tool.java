package cn.nuist;

public class Tool {
	
	public static void main(String[] args) {
		int i = 10;
		change(i);
		System.out.println(i);
		
		
		String str = "nuist";
		change(str) ;
		System.out.println(str);
	}
	

	
	private static void change(String str) {
		str = "NUIST";
	}
	private static void change(int i) {
		i++;
	}

}



