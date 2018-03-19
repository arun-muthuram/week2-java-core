package javaCore;

public class Person {
	int age;
	String name;

	Person(int age, String name) {// constructor used for instantiating an object with fields before it's usage
		if (age > 0)
			this.age = age;
		else
			System.out.println("Enter a valid age");
		this.name = name;

	}

	public static void main(String[] args) {
		Person arun = new Person(24, "Arun");

	}
}
