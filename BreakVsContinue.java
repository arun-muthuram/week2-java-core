package javaCore;

public class BreakVsContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;//skips to next iteration if i is even
			if (i == 9)
				break;//breaks out of the loop if i is 9
			System.out.println(i);
		}
	}

}
