package Modifiers;

public class Client {
	

	//default: we can access in same class and other class of same package
	

		int a = 10;
		int b = 20;
		
		public static void main(String[] args) {
			
			Client client = new Client();
			System.out.println(client.a);
			System.out.println(client.b);
		}
	}


