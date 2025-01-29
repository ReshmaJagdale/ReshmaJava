package ThisAndSuper;

public class Cat extends Animal {
	public void sound() {
		super.Sound();
		System.out.println("Cat class method");
		
	}

	public static void main(String[] args) {
		Cat C1=new Cat();
		C1.sound();
		
	}

}
