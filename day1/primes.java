import java.util.*;
//Program to print N prime numbers and find sum and average
public class primes {
	static void SieveOfEratosthenes(int[] prime) {
		int n = prime.length;
		if(n<=2)return;
		Arrays.fill(prime, 0);
		for(int i=2; i*i<n ; i++) {
			if(prime[i]==0) {
				for(int j=i*i; j<n; j+=i) {
					prime[j]=1;
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prime = new int[n+1];
		SieveOfEratosthenes(prime);
		for(int i=2; i<n; i++) {
			if(prime[i]==0)System.out.print(i+" ");
		}
		System.out.println("Done");
		sc.close();
	}
}
