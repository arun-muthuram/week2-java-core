package javaCore;

public class EqualsVs {
	public static void main(String[] args) {
		String s1 = new String("string");
		String s2 = new String("string");
		System.out.println(s1 == s2);// false, as == operator checks if both objects references refer to the same
										// object.
		System.out.println(s1.equals(s2));// true, as equals method checks if both objects have same string content.
		int a = 5;
		int b = a;
		System.out.println(a == b);// true, as == operator when used on primitives checks if they have same data
									// stored.a
	}
}
