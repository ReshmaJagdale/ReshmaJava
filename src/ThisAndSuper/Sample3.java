package ThisAndSuper;

public class Sample3 extends Sample2 {
		int Rollnumber=20;
		String Name="Tanvi";
	public static void main(String[] args) {
		Sample3 S3=new Sample3();
		S3.Demo();
		

	}
 public void Demo() {
	 int Rollnumber=23; 
	 String Name="Tanu";
	 
	 System.out.println(Rollnumber);  //Method
	 System.out.println(Name);
	 System.out.println(this.Rollnumber);// Child class--20
	 System.out.println(super.Rollnumber);  //Parent class--12
	 System.out.println(this.Name);
	 System.out.println(super.Name);
	 
 }
 
 	
 
}
