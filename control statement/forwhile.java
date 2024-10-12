package NEWN;

public class forwhile {



	public static void main(String[] args) {

		//Iteration statements for loop, while loop, do while loop [for each: arrays and collections]
		//if i know the number of iterations in advance we can can use for loop
		//if i don't know the number of iterations in advance we can can use while loop
		//if i want the iteration only one time, we use do while
		
		//int i = 0  : initialization
		//i < 5; : condition
		//i++ : increment and decrement
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int a = 6;
		while (a <= 10) {
			System.out.println(a);
//			a++;
			a+=1;
		}
		
		System.out.println();
		
		int b = 5;
		while (b >= 0) {
			System.out.println(b);
//			b--;
			b-=1;
		}
		
		
	}
}
