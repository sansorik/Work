import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		evenodd();
	}
		public static int [] evenodd(){
			 int[][] arr = { {1,2,3,4,5}, {1,9}, {3,1,8} };
			int even = 0;
			int odd = 0;
			 
			 for(int a = 0; a<arr.length;a++) {
				for(int b = 0; b<arr[a].length;b++) {
					if(arr[a][b]%2 == 0) {
						even ++;
					}
					else {
						odd++;
					}
				}
				}
				int finarr[] = {even,odd};
				System.out.print(Arrays.toString(finarr));

				return finarr;

			 
			 
			 
			}
		
	
	
	
}
