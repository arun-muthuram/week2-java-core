package javaCore;

public class StaticVsInstanceMembers {
	int instanceMember = 5;//instance variable
	static int staticMember = 10;//static variable

	void instanceMethod() {//instance method
		System.out.println("an instance method");
	}

	public static void staticMethod() {//static method
		System.out.println("a static method");
	}

	public static void main(String[] args) {

		System.out.println(staticMember);//can access static variables and methods without creating an object instance.
		staticMethod();
		StaticVsInstanceMembers one = new StaticVsInstanceMembers();
		System.out.println(one.instanceMember);//can only access instance variables and methods by using a object instance.
		one.instanceMethod();

	}

}
