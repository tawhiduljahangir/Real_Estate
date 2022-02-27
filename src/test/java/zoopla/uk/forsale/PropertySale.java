package zoopla.uk.forsale;

public class PropertySale {

public static void getJahangir() {
	String Name = "Tawhid";
	int nid = 12345;
	double salary = 10000;
	System.out.println(Name +" my nid is "+ nid + " my rent " + salary);
	
	
}
	
	
	
	
	
	int salary;
	String name;
	String info;


	
	
	public void getSalary() {
		salary = 8000;
		name = " Alam ";
		info =" 123-13-3534 ";
		System.out.println(salary+name+info);
		
	}
	
	public void getName() {
		salary = 9000;
		name = " Naveed ";
		info =" 16420 higland ave ";
		System.out.println(salary+name+info);
		
	}
	
	public void getInfo() {
		salary = 8000;
		name = " Nahid ";
		info =" 25-36 hillside ";
		System.out.println(salary+name+info);
		
    }
	
	public static void main(String[] args) {
		PropertySale obj = new PropertySale();
		obj.getSalary();
		obj.getName();
		obj.getInfo();
		
		PropertySale.getJahangir();
	}
		
	}

	