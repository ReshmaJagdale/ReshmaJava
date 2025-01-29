package Constructor;

public class Userdefineconstructor {
	
	int No1;
	int No2;
	int Addition;
	
	public Userdefineconstructor() {   //Zero input parameter
		System.out.println("Zero input parameter");
	}
	public  Userdefineconstructor(int n1,int n2) { //Two input parameter"
		 No1=n1;
		 No2=n2;
		 Addition=No1+No2;
	}
	
	//Main method

	public static void main(String[] args) {   // static
		Userdefineconstructor UC=new Userdefineconstructor();
		Userdefineconstructor UC1=new Userdefineconstructor(10,20);
		
		 System.out.println(UC1.No1+" "+UC1.No2);
		 System.out.println(UC1.Addition);
		 UC1.Demo();
		
	}
  public void Demo() {   ///Non static
	  System.out.println(No1+" "+No2);
	  System.out.println(Addition);
  }
}
