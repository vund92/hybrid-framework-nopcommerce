package singletonPattern;

public class TestSingleton {
	public static void main(String[] args) {
//		GlobalConstants o1 = GlobalConstants.getGlobalConstants();
//		GlobalConstants o2 = GlobalConstants.getGlobalConstants();
//		GlobalConstants o3 = GlobalConstants.getGlobalConstants();
//		
//		System.out.println(o1.hashCode());
//		System.out.println(o2.hashCode());
//		System.out.println(o3.hashCode());

		Thread t1 = new Thread(() -> GlobalConstants.getGlobalConstants());
		Thread t2 = new Thread(() -> GlobalConstants.getGlobalConstants());
		Thread t3 = new Thread(() -> GlobalConstants.getGlobalConstants());
		t1.start();
		t2.start();
		t3.start();
	}
}
