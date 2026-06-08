package com.singleton.one;

class Singleton {
	private static Singleton instance = null;
	private Singleton() {
		System.out.println("Singleton COnstructor called. New Object created");
	}
	public static Singleton getInstance() {
		if(instance == null) { // means no object is yet created then
			instance = new Singleton();
		}
		//if the instance is already created first then it will directly return the "instance"
		return instance;
	}
}
public class ThreadUnsafeSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);  //compares the memory addresses its checks whether both variable point to exac same memory location
		System.out.println(s1.equals(s2));
	}

}
