package javaCore;

public class StringVsStringBuilderVsStringBuffer {
	public static void main(String[] args) {
		String s1 = "string";// immutable, stored in constant string pool,fast
		StringBuffer s2 = new StringBuffer("string buffer");// mutable,thread-safe,slow and stored in heap
		StringBuilder s3 = new StringBuilder("string builder");// mutable, not thread-safe, fast and stored in heap
		System.out.println("String object hashcode before concatenation - " + s1.hashCode());
		System.out.println("StringBuffer object hashcode before concatenation - " + s2.hashCode());
		System.out.println("StringBuilder object hashcode before concatenation - " + s3.hashCode());
		s1 = s1 + " immutable";// creates a new string and returns the reference to s1.
		s2.append(" mutable");// changes the StringBuffer object.
		s3.append(" mutable");// changes the StringBuilder object.
		System.out.println("String object hashcode after concatenation - " + s1.hashCode());//different hashcode indicates creation of new object
		System.out.println("StringBuffer object hashcode after concatenation - " + s2.hashCode());
		System.out.println("StringBuilder object hashcode after concatenation - " + s3.hashCode());
	}
}
