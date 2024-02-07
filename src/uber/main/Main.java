package uber.main;
import java.util.Scanner;

import entity.and.database.Users;
public class Main {
	
	public static void main(String[] args) {
		
		//Objects creation
		Scanner scan = new Scanner(System.in);
		Users u = new Users();
		
		//user registration
		System.out.println("------WELCOME TO UBER SERVICE-----");
		System.out.println("USER REGISTRATION");
		
		System.out.print("User Name: ");
		u.setUserId(scan.next());
		
		System.out.print("Password: ");
		u.setPassword(scan.next());
		
		if(u.getUserId().equals("user") && u.getPassword().equals("Password@123")) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Incorrect Credentials");
			System.exit(0);
		}
			//System.out.println("New User Registration successful");
			
 
		
		//ride selection
		System.out.println("Select Service: \n1.Bike 2.Auto 3.Taxi");
		
		switch(scan.nextInt()) {
			case(1):
				u.setRideCategory("Bike");
				break;
			case(2):
				u.setRideCategory("Auto");
				break;
			case(3):
				u.setRideCategory("Taxi");
				break;
			default:
				System.out.println("Please, choose valid category..");
				System.exit(0);
		}
		
		//desination selection
		System.out.println("Select destination: \n 1.Railway station 2.Bus station 3.Movie theatre");
		
		switch(scan.nextInt()) {
			case(1):
				u.setDestination("Railway station");
				break;
			case(2):
				u.setDestination("Bus station");
				break;
			case(3):
				u.setDestination("Movie theatre");
				break;
			default:
				System.out.println("Please, choose valid destination...");
				System.exit(0);
			
		}
//		//Objects creation
		/*Scanner scan = new Scanner(System.in);
		Users u = new Users();
		boolean validCredentials=false;
		//user registration
		do {
			System.out.println("------WELCOME TO UBER SERVICES-----");
			System.out.println("USER REGISTRATION");
			System.out.print("User Id: ");
			u.setUserId(scan.next());
			System.out.print("Password: ");
			u.setPassword(scan.next());
			 String userIdPattern = u.getUserId();
		     String passwordPattern =u.getPassword();
			if(Pattern.matches("[a-zA-Z0-9]+", userIdPattern) && Pattern.matches("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$", passwordPattern)) {
				System.out.println("Logged in Successfully");
				validCredentials=true;
			}
			else {
				System.out.println("Invalid credentials");
			}
		}
		while(validCredentials==false);*/
			
		//price calculation
		switch(u.getRideCategory()) {
			case("Bike"):
				switch(u.getDestination()) {
					case("Railway station"):
						u.setPrice(100);
						break;
					case("Bus station"):
						u.setPrice(120);
						break;
					case("Movie theatre"):
						u.setPrice(170);
						break;
				}
				break;
			case("Auto"):
				switch(u.getDestination()) {
					case("Railway station"):
						u.setPrice(200);
						break;
					case("Bus station"):
						u.setPrice(220);
						break;
					case("Movie theatre"):
						u.setPrice(270);
						break;
				}
				break;
			case("Taxi"):
				switch(u.getDestination()) {
					case("Railway station"):
						u.setPrice(300);
						break;
					case("Bus station"):
						u.setPrice(320);
						break;
					case("Movie theatre"):
						u.setPrice(370);
						break;
				}
				break;
		}
		
		//Booking Details
		System.out.println("Price to destination: "+u.getPrice());
		System.out.println("1.Proceed\n2.Cancel");
		if(scan.nextInt()==1) {
			System.out.println();
			System.out.println("---Booked Successfully----");
			System.out.println();
			System.out.println(u);
		}
		else {
			System.out.println("----Booking cancelled----");
		}
		
		scan.close();
	}

}
