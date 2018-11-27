package cn.nuist;

public class Singleton2 {
private Singleton2() {}
	
	
	private static Singleton2 s = new Singleton2();
	
	public static Singleton2 getSingleton() {

		return s;
	}
}
