import java.util.*;
// Pyramid
public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int size=1;
		int num=1;
		for(int i=row; i>0; i--) {
			for(int j=i; j>=0; j--) {
				System.out.print(" ");
			}
			int temp = size;
			while(temp>0) {
				System.out.print(num +" ");
				num++;
				temp--;
			}
			System.out.println();
			size += 2;
			sc.close();
		}
	}
}