package NEWN;

public class Eg4 {
	

		public static void main(String[] args) {
			
			//int a[] = new int[0];
			//a[0] = 10;
			//System.out.println(a[0]); // java.lang.ArrayIndexOutOfBoundsException:
			
			int b[] = new int[-5];
			b[-4] = 10;
			System.out.println(b[-4]); // java.lang.NegativeArraySizeException: -5
		}
	}


