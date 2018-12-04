
public class RecIter{
	public static int fiboR(int n) {
		if(0 <= n && n < 2) {
			return n;
		}
		else {
			return fiboR(n-1) +fiboR(n-2);
		}
	}
	public static int fiboI(int n) {
	int fib1 = 1;
	int fib2 = 2;
	int fibnumber = 2;
		
		
		if(0 <= n && n < 2) {
			return n;
		}
		else {
			for(int z=3; z<n; z++) {
				fibnumber = fib1 + fib2;
				fib1 = fib2;
				fib2 = fibnumber;
			}
				return fibnumber;
			
		}
	}
	public static int factR(int n) {
		 int result;
	        if(n==0 || n==1)
	return 1;
	        result = factR(n-1)*n;
	        return result;
	}
	public static int factI(int n) {
		  int sum = 1;
	        for (int x = 1; x < n+1 ; x++){
	            sum = x*sum;
	        }
	return sum;       	        
	}
	public static int gcdR(int a, int b) {
        if(a == b) {
        	return a;}
        else {
        	if(a>b) {
        	return gcdR(a-b,b);}
        	else {
        		return gcdR(a,b-a);
        	}
}
	}
        public static int gcdI(int a, int b) {
        	if(a == b) {
        		return a;}
        	else {
        		while(a != b) {
        			if(a>b) {
        				a -= b;
        			}
        			else {
        				b -= a;
        			}
        		}
        		return a;
        				
        			}
        		}
        public static int maxElem(int[] arr, int from, int to) {
        	  int max = 0;
              if (to > (arr.length-1)){
                  to -= 1;
              }
              if (from > to || from == (to-1)){
                  return max;
              }
              else {
                  to -= 1;
                  if (max < (Math.max(arr[to],arr[from]))) {
                      max = Math.max(arr[to],arr[from]);
                      //System.out.println("current max: "+max);
                  }
                  //System.out.println("current max: "+max);
                  from++;
                  //System.out.println("from "+from);
                  //System.out.println("to "+to);
                  if ((to-from) != 1){
                      //System.out.println("recursion");
                      maxElem(arr, from, to);
                  }
                  else {
                  }
                  //return max;
              }
              return max;
      }
        public static void reverse(int[] arr, int from, int to) {
        	int temp = 0;
        	   if (to > (arr.length-1)){
        		   to -= 1;}
        	temp = arr[from];
        	arr[from] = arr[to];
        	arr[to]=temp;
        	to--;
        	from++;
        		
        	if(to-from >=1) {
        		reverse(arr,from,to);
        	}
        }
        	public static boolean isPalindrom(String s) {
        	if(s.length()>1) {
        		char char0 = s.charAt(0);
        		char char1 = s.charAt((s.length())-1);
        		
        		if(char0 != char1) {
        			return false;}
        		else {
        			String next = s.substring(1, s.length()-1);
        			return isPalindrom(next);
        		}
        		 
        			
        		}
        	else {
        		return true;
        	}
        	}
        	
	
	
	
	
	

	

		
public static void main (String[] args) {
System.out.println(RecIter.fiboR(45));
System.out.println(RecIter.fiboI(45));
System.out.println(RecIter.factR(10));
System.out.println(RecIter.factI(10));
System.out.println(RecIter.gcdR(12125,40643));
System.out.println(RecIter.gcdI(12125,40643));
int[] a = {3,8,2,9,7};
System.out.println(RecIter.maxElem(a,0,a.length));
RecIter.reverse(a,0,a.length);
for (int i = 0; i < a.length; ++i)
System.out.print(a[i] + " ");
System.out.println();
System.out.print("Is 'radar' a palindrom? ");
System.out.println(RecIter.isPalindrom("radar"));
System.out.print("Is 'rover' a palindrom? ");
System.out.println(RecIter.isPalindrom("rover"));
}
}
		
		
		
		
		
		
		
		
		
		
	

