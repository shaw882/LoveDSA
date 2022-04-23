package Pattern;

public class reverseHalfPyramid {
	public static void main(String[] args) {
		int n=4;
		int count = n;
		for(int row=1; row<=n; row++) {
//			for(int col=1; col<=n-row+1; col++) {
//				System.out.print("* ");
//			}
			
//			for(int col=0; col<=n-row; col++) {
//				System.out.print("* ");
//			}
				
			for(int col=1; col<=count; col++) {
				System.out.print("* ");
			}
			System.out.println("");
			count--;
		}
	}
}


//* * * * 
//* * * 
//* * 
//* 