package Methods;

public class Method18 {

	public static void main(String[] args) {
		Method18 M18 =new Method18();
		
		int Numbers=M18.square(5);
		System.out.println(Numbers);
		
		int no=M18.Addition(20);
		System.out.println(no);
		
		int Add=M18.Addition(20,20);
		System.out.println(Add);
			
		
	}
	public int square(int num) {
		return num*num;
	}
	
	public int Addition(int a) {//Non static one input parameter method
		return 10+a;
	}
	public static int Addition(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}

}

