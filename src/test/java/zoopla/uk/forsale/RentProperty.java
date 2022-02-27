package zoopla.uk.forsale;




public class RentProperty {
	
	
	
	String name;
	String address;
	int phoneNum;
	double salary;

	public void getName() {
		name = "Tawhid";
		address = "16420 higland ave";
		phoneNum = 347-963-4380;
		salary = 7000.50;
		System.out.println(name+address+phoneNum+salary);
		
	}
	
	public void getAddress() {
		name = "Naveed";
		address = "16-20 hillsid ave";
		phoneNum = 347-953-4884;
		salary = 10000.50;
		
		System.out.println(name+address+phoneNum+salary);
		
	}
	
	public void getPhoneNum() {
		name = "Nahid";
		address = "37-06 69th st";
		phoneNum = 347-922-4993;
		salary = 8000.50;
		System.out.println(name+address+phoneNum+salary);
		
	}
	
	public void getSalary() {
		name = "Taju";
		address = "35-72 35th ave";
		phoneNum = 347-263-4382;
		salary = 7000.50;
		System.out.println(name+address+phoneNum+salary);
		
		
	}
	
	public static void main(String[] args) {
		RentProperty obj = new RentProperty();
		obj.getName();
		obj.getAddress();
		obj.getPhoneNum();
		obj.getSalary();
		
		
		PropertySale.getJahangir();
	}


	
	}


