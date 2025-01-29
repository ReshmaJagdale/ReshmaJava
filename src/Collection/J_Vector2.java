package Collection;

import java.util.Vector;

public class J_Vector2 {

	public static void main(String[] args) {
		Vector<String> colors = new Vector<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.addElement("Java");
		System.out.println(colors);
		System.out.println(colors.get(0));
		colors.set(1, "yellow");
		System.out.println(colors);

	}

}
