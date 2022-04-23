package Pattern;

public class HollowInvertedHalfPyramid {
	public static void main(String[] args) {
		int n=10;
		for(int row=1; row <=n; row++) {
			if(row==1 || row==n) {
				for(int col=1; col<=n-row+1; col++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int col=1; col<=n-row-1; col++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
// ase we see first and last row do not have space so we handle it seperately
//		******
//		*   *
//		*  *
//		* *
//		**
//		*