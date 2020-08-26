/**
 * 
 */
package testdemo;


import org.apache.commons.io.comparator.LastModifiedFileComparator;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		reverseInputString("a.b.c");
		// TODO Auto-generated method stub
		File dir = new File("/Users/Jss/Videos");
		 int fileCount=dir.list().length;
		    System.out.println("\n2) Total Files in this Directory:"+fileCount);
		File[] files = dir.listFiles();

		

		System.out.println("\tSort files by Last date modified");

		Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			System.out.printf(" File: %s - \t\t\t\t" + new Date(file.lastModified()) + "\n", file.getName());
		}

	}
	private static void reverseInputString(String input) {
		StringBuilder sb = new StringBuilder(input);
		String result = sb.reverse().toString();
		System.out.println("\n 1)  a.b.c = "+result);
	}

}



