
//Program to print Armstrong number between 1 to 1000
public class cntArmstrongNumbers {

	public static void main(String[] args) {
		int cnt =0;
		for(int i=1;i<=1000;i++) {
			int size = (""+i).length();
			if(ArmstrongNumber.isArmstrongNumber(size, i)) {
				cnt++;
			}
		}
		System.out.println("Total armstrong numbers: "+ cnt);
	}
}
