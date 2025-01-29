package Constructor;

public class Exampleofconstructor {
	String Name;
	int RollNumber;
	public Exampleofconstructor (String name,int Rollnumber) {
	Name=name;
	RollNumber=Rollnumber;
	}

//Need of constructor
	//once we create object complusory we required to perform initialization fit that object.
	
//if you are not performing initialization then object is not responding correct output.
	
public static void main(String[]args) {
	Exampleofconstructor s1=new Exampleofconstructor ("Reshma",45);
	Exampleofconstructor s2=new Exampleofconstructor ("Ashish",47);
	Exampleofconstructor s3=new Exampleofconstructor ("Balaji",46);
	
	
	System.out.println(s1.Name+" "+s1.RollNumber);
	System.out.println(s2.Name+" "+s2.RollNumber);
	System.out.println(s3.Name+" "+s3.RollNumber);
	
}
}

