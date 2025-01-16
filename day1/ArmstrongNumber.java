import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrongNumber(int size, int n) {
		int num=n;
		int sum=0;
		while(n>0) {
			//power of last digit 
			sum += Math.pow(n%10, size);
			n/=10;
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int size=(""+n).length();
		if(isArmstrongNumber(size, n)) System.out.println("Yes, It is Armstrong number");
		else System.out.println("Nope, It is not an Armstrong number");
		sc.close();
	}
}
