package test1;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int matrix[][] = {
						{1,2,3,4,5,6,7},
						{8,9,10,11,12,13,14},
						{15,16,17,18,19,20,21},
						{22,23,24,25,26,27,28},
						{29,30,31,32,33,34,35}
						};
		
		for(int i=0; i<=matrix.length/2; i++) {
			int j,k;
			for(j=i; j<matrix[0].length-i; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			j--;
			for(k=i+1; k<matrix.length-i; k++) {
				System.out.print(" " + matrix[k][j] + " ");
			}
			k--;
			
			//System.out.print("Culprit");
			for(j=matrix[0].length-i-2; j>i; j--) {
				if(j-1 == i) {
					break;
				}
				System.out.print(" " + matrix[k][j] + " ");
			}
			//System.out.print("Culprit");
			for(k=matrix.length-i-1; k>i; k--) {
				System.out.print(" " + matrix[k][j] + " ");
			}
			System.out.println(i + "th iteration");
		}
		
		
		
	}
	
}
