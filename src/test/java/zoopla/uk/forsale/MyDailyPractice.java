package zoopla.uk.forsale;

public class MyDailyPractice {

	
	
	String name;
	int num;
	double value;


public String getRoton() {
	return name;
}

public int getNahidInfo() {
  
return num;
	
}

public double getSabiha() {
	return value;
}

public void getAli(String name) {
	
	System.out.println(name);
}


public int getRaju(int num) {
	return num;
}

public static String getAla( String name) {
	return name;
}

	
	
	public static void main(String[] args) {

		MyDailyPractice obj = new MyDailyPractice();
		System.out.println(obj.getRoton());
		obj.getAli("Nowab");
		System.out.println(obj.getRaju(420));
		System.out.println(MyDailyPractice.getAla("alauddin"));
		
			}
	}