package javaCore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalVsFinallyVsFinalize {
	final int a = 10;// the value of a cannot be changed since the usage of final keyword.

	public static void main(String[] args) {
		File file = new File("file.txt");
		Scanner scanner = null;
		// int a=1; produces compile time error.

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");

		} finally {// finally block used with a try block, executes the code within, irrespective
					// of exception's occurrence.
			System.out.println("Closing scanner");
			scanner.close();
			System.gc();// calls the finalize method.
		}

	}

	public void finalize() // finalize method is called by garbage collector to clean up objects having no
							// references.
	{
		System.out.println("Clearing null objects");
	}

}
