import java.util.*;

//Program to print palindrome number upto N numbers
public class cntPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(palindrome.isPalinDrome(""+i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
