import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {1,9,6} };
		int [] arr2 = new int [(arr.length)];
		for(int a = 0;a < arr.length;a++ ) {
			int mx = 0;
			for(int b = 0; b < arr[a].length; b++) {
			if(arr[a][b] > mx) {
				mx = arr[a][b];
			}
			arr2[a] = mx;
		}
			
		}
		System.out.print(Arrays.toString(arr2));
	}
}
