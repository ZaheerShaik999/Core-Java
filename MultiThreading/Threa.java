package NEWN;

public class Threa implements Runnable{
	
		

		

		public static void main(String[] args) {
			
			Threa eg4 = new Threa();
			Thread t1 = new Thread(eg4);
			t1.start();
			
			Thread t2 = new Thread(eg4);
			t2.start();
			
			Thread t3 = new Thread(eg4);
			t3.start();
		}

		@Override
		public void run() {
			
			System.out.println("Run() Method");
	

}
}
