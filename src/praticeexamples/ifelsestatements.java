package praticeexamples;

public class ifelsestatements {

	public static void main(String[] args) {
		int marks=78;
		if(marks>90 && marks<100) {
			System.out.println("Result is A");	
		}
		else if(marks>80 && marks<90) {
			System.out.println("Result is B");	
		}
		else if(marks>70 && marks<80) {
			System.out.println("Result is C");
		}
		else if(marks>40&& marks<70) {
			System.out.println("Result is D");
		}
		else {
			System.out.println("Result is F");
		}
			System.out.println("Completed");
	}

}
