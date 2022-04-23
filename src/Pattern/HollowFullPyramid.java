package Pattern;

public class HollowFullPyramid {
	public static void main(String[] args) {
		int n=10;
		int space=1;
		for(int row=1; row <=n; row++) {
			for(int col=1; col<=n-row; col++) {
				System.out.print(" ");
			}
			if(row==1 || row==n) {
				for(int col=1; col<=n-row+1; col++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int col=1; col<=space; col++) {
					System.out.print(" ");
					space = space + 2;
				}
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
