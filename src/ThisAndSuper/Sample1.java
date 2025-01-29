package ThisAndSuper;

public class Sample1 {
        int Rollnumber=45;
        String Name="Reshma";
	public static void main(String[] args) {
		
		Sample1 S1=new Sample1();
		
		//System.out.println(S1.Rollnumber);
		//System.out.println(S1.Name);
		S1.Demo();
	}
public void Demo() {
	int Rollnumber=44;
	String Name="Ashish";
	System.out.println(Rollnumber);
	System.out.println(Name);
	System.out.println(this.Rollnumber);
	System.out.println(this.Name);
	
}
}
