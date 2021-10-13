//Write a program to find the longest word in a text file.
package day7;
import java.util.*;
import java.io.*;
public class Ex9 {

	public static void main(String[] args) throws FileNotFoundException {
				Scanner sc=new Scanner(new File("/home/himanshu.chaturvedi/WorkSpace/Eclipse/spark/src/day7/F1.txt"));
				String str;
				String newStr ="";
				while(sc.hasNext()) {
					str=sc.next();
					if(str.length()>newStr.length()) {
						newStr=str;
					}
				}
				System.out.println(newStr);
					
			

	}

}
