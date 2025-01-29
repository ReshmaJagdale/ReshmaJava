package Inheritance_Multilevel;

public class Test {

	public static void main(String[] args) {
		
		Whatzappv1 W1=new Whatzappv1();
		W1.textmsg();
		
		System.out.println();
		
		WatzappV2 W2=new WatzappV2();
		W2.Voicecall();
		W2.textmsg();
		
		System.out.println();
		
		WatzappV3 W3=new WatzappV3();
		W3.Videocalling();
		W3.Voicecall();
		W3.textmsg();
		
		System.out.println();
		
		WatzappV4 W4=new WatzappV4();
		W4.payment();
		W4.Videocalling();
		W4.Voicecall();
		W4.textmsg();
		
	}

}
