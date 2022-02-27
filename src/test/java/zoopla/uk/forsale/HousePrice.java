package zoopla.uk.forsale;
   
public class HousePrice {
	 
	
	 int housePrice;
	String houseAddress;
	String city;
	
	public void getHousePrice() {
		housePrice = 50000;
		houseAddress = "16420 higland";
		city = "Jamaica";
	
		System.out.println(housePrice+houseAddress+city);
		
		
	}
	
	public void getHouseAddress() {
		housePrice = 60000;
		houseAddress = "37-06 37th ave";
		city = "Jackson hts";
		
		System.out.println(housePrice+houseAddress+city);

		
		
	}
	
	public void getCity() {
		housePrice = 70000;
		houseAddress = "2553 69th st";
		city = "meshpath";
		
		System.out.println(housePrice+houseAddress+city);
		
	
	}
	
		
	
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HousePrice obj = new HousePrice();
		obj.getHousePrice();
		obj.getHouseAddress();
		obj.getCity();
        
		
	}

}
