//Write a program to read plain text file
package day7;
import java.util.*;
import java.io.*;
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader file=new FileReader("/home/himanshu.chaturvedi/WorkSpace/Eclipse/spark/src/day7/F1.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}
