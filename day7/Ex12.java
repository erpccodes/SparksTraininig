//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
//"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
package day7;
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		if(arr[0]<arr[1] && arr[1]<arr[2])
			System.out.println("Accending Order");
		else if(arr[0]>arr[1] && arr[1]>arr[2])
			System.out.println("Number is decending");
		else
			System.out.println("Number is neither in increasing nor decreasing order");

	}

}
