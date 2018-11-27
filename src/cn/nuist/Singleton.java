package cn.nuist;

public class Singleton {
	private Singleton() {}
	
	
	private static Singleton s = null;
	
	public static Singleton getSingleton() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	
	

}
