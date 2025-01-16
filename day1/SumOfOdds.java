import java.util.*;
public class SumOfOdds {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp%2==1)sum+=temp;
		}
		System.out.println(sum);
		sc.close();
	}
}
