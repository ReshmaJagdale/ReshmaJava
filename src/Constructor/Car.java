package Constructor;

public class Car { //Class
	
	String Model;
	int Year;
	
	public Car() {   //Constructor declare
		Model="Default Model";
		Year=2021;	
	}
	public Car(String model,int year) {
		Model=model;
		Year=year;
	}
	
	
	
 public static void main(String[] args) {
	 Car C=new Car();
	 Car C1=new Car("Creta",2022);
	 
}
 public void Display(){
	 System.out.println("model---->" + Model + "year---->" +Year);
	 }

	}


