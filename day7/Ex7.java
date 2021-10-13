//Write a method to count all vowels in a string.
package day7;

public class Ex7 {

	public static void main(String[] args) {
	
			int count=0;
			String st="session going on";
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u') {
					count++;
				}
				
			}
			System.out.println(count);
	}

}
