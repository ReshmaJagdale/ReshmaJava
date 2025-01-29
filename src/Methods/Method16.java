package Methods;

public class Method16 {
	
		public static void main(String[] args) {
			Method16.Studentinformation("VCTC","Rohit","Jagdale","jag.resh@gmail.com",2012,45,'A',70.03f);
	}
	public static void Studentinformation(String InstName, String FirstName, String LastName, 
            String MailId, int PassoutYear, int RollNo, 
            char Grade, float Percentage) {
		

	
		System.out.println("InstituteName----> " + InstName + 
                " FirstName----> " + FirstName + 
                " LastName----> " + LastName + 
                " MailId----> " + MailId + 
                " PassoutYear----> " + PassoutYear + 
                " RollNumber----> " + RollNo + 
                " Grade----> " + Grade + 
                " Student Percentage----> " + Percentage + "%");
}
		
		
}
	

