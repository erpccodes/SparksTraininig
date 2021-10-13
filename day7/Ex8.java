//Write a program to print last modified time of a file
package day7;
import java.util.*;
import java.io.*;
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl=new File("/home/himanshu.chaturvedi/WorkSpace/Eclipse/spark/src/exercises/F1.txt");
		Date date=new Date(fl.lastModified());
		System.out.println(date);
	}

}
