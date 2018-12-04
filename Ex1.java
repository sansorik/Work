import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		int indexRow = 0;
		int indexCol = 0;
		int mxRow = 0;
		int mxCol = 0;
		
		
		int[][] arr = { {1,3,2}, {3,4,8}, {2,6,8}, {1,8,5} };		
		for(int a = 0; a<arr.length; a++) {
			int curr = 0;		
			for(int b = 0;b< arr[a].length; b++ ) {
				
				curr += arr[a][b];
				if(curr > mxRow) {
					mxRow = curr;
					indexRow = a;		
				}	
			}
		}
		
		for(int b = 0;b< arr[b].length; b++) {
			int curr2 = 0;
			
			
			
			for(int a = arr[b].length;a>0; a-- ) {
				
				curr2 += arr[a][b];
				if(curr2 > mxCol) {
					mxCol = curr2;
					indexCol = b;		
				}
			}
		}
		System.out.println("max row index: "+ indexRow);
		System.out.println("max column index:"+ indexCol);
		
		
		
		
		
		
		
	}

}
