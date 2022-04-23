package Pattern;

public class Pyramid {
	public static void main(String[] args) {
		int n=4;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=n-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

//		   * 
//		  * * 
//		 * * * 
//		* * * * 
//		
//		row	space star
//		1	  3     1
//		2     2     2
//		3     1     3
//		4     0     4
//		therefor formula for
//		space = n-row
//		star = row