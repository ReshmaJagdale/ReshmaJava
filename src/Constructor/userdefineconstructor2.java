package Constructor;

public class userdefineconstructor2 {

	String Name;
	String Model;
	int Price;
	String Engine;
	int Year;
	
	public userdefineconstructor2(String name,String model,int price,String engine,int year) {
		
		Name=name;
		Model=model;
		Price=price;
		Engine=engine;
		Year=year;
			
	}
	public static void main(String[] args) {
		
		userdefineconstructor2 UC=new userdefineconstructor2("Creata","Hundai",2000000,"Automatic",2020);
		userdefineconstructor2 UC1=new userdefineconstructor2("Maruti","Suzuki",3400000,"Manual",2000);
		userdefineconstructor2 UC2=new userdefineconstructor2("Kia","Seltos",2400000,"Automatic",2024);
		
System.out.println("Carname-->" + UC.Name + " || "+"Model-->"+UC.Model+" || "+"Price-->"+UC.Price+" || "+"Engine-->"+UC.Engine+" || "+"Year-->"+UC.Year);	
System.out.println("Carname-->" + UC1.Name +" || "+"Model-->"+UC1.Model+" || "+"Price-->"+UC1.Price+" || "+"Engine-->"+UC1.Engine+" || "+"Year-->"+UC1.Year);		
System.out.println("Carname-->" + UC2.Name +" || "+"Model-->"+UC2.Model+" || "+"Price-->"+UC2.Price+" || "+"Engine-->"+UC2.Engine+" || "+"Year-->"+UC2.Year);		
		
	}

}
