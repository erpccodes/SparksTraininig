//Write a program to add two matrices of the same size.
package day7;
import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[][]=new int[3][3];
		int ar2[][]=new int[3][3];
		int sum[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		// Taking input in first matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar1[i][j]=sc.nextInt();
			}
			
		}
		
		
		// Taking input in second matrix

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar2[i][j]=sc.nextInt();
			}
			
		}
		
		// Sum of Matrix
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=ar1[i][j]+ar2[i][j];
			}
			
		}
		sc.close();
		
		// Printing the Sum of Matrix
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("\n");
			
		}
	}
	
	
}
