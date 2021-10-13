//Write a program to get the contents of a given string as a byte array.
package day7;

public class Ex3 {
	public static void  main(String args[]) {
		String s1="Session Going On";
		byte[] bt=s1.getBytes();
		String newString=new String(bt);
			System.out.println(newString);
		
	}
}
