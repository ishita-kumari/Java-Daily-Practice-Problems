import java.util.*;
//Program to check the given number is Palindrome or not

public class palindrome {
	static boolean isPalinDrome(String s) {
		int left=0, right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}
			else return false;
		}
		return true;
	}
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = ""+num;
		System.out.println(isPalinDrome(s));
		sc.close();
	}
}
