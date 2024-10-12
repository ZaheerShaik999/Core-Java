package NEWN;

public class Eg6 {
	
		public static void main(String[] args) {
			
			int a[] = { 10, 20, 30, 40, 50 };
			
			//get all elements
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println();
			
			//get all elements : (control)
			for (int i = 0; i < 2; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println();
			
			//getAll Elements : objects
			for (int i : a) {
				System.out.println(i);
			}
		}
	}

