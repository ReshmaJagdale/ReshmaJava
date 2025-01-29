package Abstraction;

public abstract class Incompleteclass {

	public static void main(String[] args) {
		

	}
   public void M1() {//Method Declaration -No static complete method
	System.out.println("M1 Method");//Method Definition
     }
   public abstract void M2();//Incomplete Method
   
   public abstract void M2(int i);
   
   public void M3() {//Method Declaration -No static complete method
	   System.out.println("M3 Method");//Method Definition
   }
	   
}
