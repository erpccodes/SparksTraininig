//Write a method to display the first 50 pentagonal numbers
// formula for finding pantagonal number n=(3*i*i-i)/2
package day7;

public class Ex6 {

	public static void main(String[] args) {
	

		int i=1;
		while(i<=50) {
			System.out.println((3*i*i-i)/2);
			i++;
		}
	}

}
