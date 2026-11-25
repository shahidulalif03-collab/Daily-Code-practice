package polymorphism;

public class Test {
public static void main(String[]args) {
	Rectangle r1 =new Rectangle(10,20);
	Triangle t1 =new Triangle(14,20);
	System.out.println(r1.area());
	System.out.println(t1.area());
	
}
}
