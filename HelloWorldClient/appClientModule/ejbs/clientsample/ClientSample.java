package ejbs.clientsample;

import ejbs.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        HelloWorldService service1 = new HelloWorldService();
	        System.out.println("Create Web Service...");
	        HelloWorld port1 = service1.getHelloWorld();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.sayMoreHello());
	        System.out.println("Server said: " + port1.sayHello());
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
