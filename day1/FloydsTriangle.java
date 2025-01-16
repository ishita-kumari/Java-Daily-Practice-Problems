import java.util.*;

public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1; i<=n; i++) {
			int j=i;
			while(j>0) {
				j--;
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			sc.close();
		}
	}
}
