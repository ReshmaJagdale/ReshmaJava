package Constructor;

public class Needofconstructor {
	
	String Model;//non static variable
	 int Year;//non static variable
	 
	//constructor with same classname
	 public Needofconstructor(String model,int year) {
		 Model=model;
		 Year=year; 
	 }
//main method 
	public static void main(String[] args) {
		Needofconstructor NC=new Needofconstructor("Tata",2021);
		Needofconstructor NC1=new Needofconstructor("Kia",2022);
		Needofconstructor NC2=new Needofconstructor("Hundai",2023);
		
		System.out.println(NC.Model+" "+NC.Year);
		System.out.println(NC1.Model+" "+NC1.Year);
		System.out.println(NC2.Model+" "+NC2.Year);	
		
	}

}
