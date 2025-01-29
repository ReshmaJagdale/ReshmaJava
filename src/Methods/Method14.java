package Methods;

public class Method14 {
public static void main(String[] args) {
	Method14.Mymethod("Reshma");
	Method14.Studentinformation("Tanvi", 3);
	Method14.Studentinformation("Niharika", 35);
	
}

public static void Mymethod (String Firstname)//Variable Datatype- String is used
{
System.out.println("Firstname---->" +Firstname);
}

public static void Studentinformation(String Firstname,int age)
{
	System.out.println(Firstname+" "+age);
}
}
