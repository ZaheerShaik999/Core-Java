package NEWN;

public class Eg5 {
	
		public static void main(String[] args) {

			// loops: for loop, while loop, do-while, for each (arrays, collections)
			//For loop
			int a[] = { 10, 20, 30, 40, 50 };
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}

			System.out.println(" ");

			for (int i = a.length - 1; i >= 0; i--) {
				System.out.println(a[i]);
			}

			//While loop
			System.out.println(" ");

			int i = 0;

			while (i < 5) {

				System.out.println(a[i]);
				i++;
			}

			System.out.println(" ");

			int j = 4;

			while (j >= 0) {

				System.out.println(a[j]);
				j--;
			}
			
			//Task : do-while
			
			System.out.println(" ");
			
			//For Each: Objects
			for (int k : a) {
				System.out.println(k);
			}
		}
	}


