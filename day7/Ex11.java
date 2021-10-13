//Write a program that reads an integer and check whether it is negative, zero, or positive.
package day7;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("Number is ZERO");
			}else if(num>0)
				System.out.println("Number is Positive");
			else
				System.out.println("Number is negative");
	}

}
