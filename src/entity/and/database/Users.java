package entity.and.database;

public class Users {
	String userId;
	String password;
	String rideCategory;
	String destination;
	double price;
	
	
	public Users() {
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRideCategory(String rideCategory) {
		 this.rideCategory=rideCategory;
	}
	public String getRideCategory() {
		return rideCategory;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String desination) {
		this.destination = desination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "UserId: " + userId +"\nDriver name: Manik Basha\nVehicle No: AP 02 R 1234\nRideCategory: " + rideCategory
				+ "\nDestination: " + destination + "\nPrice: " + price ;
	}
}
