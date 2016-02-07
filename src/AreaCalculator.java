import java.util.Scanner;
public class AreaCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle tr = new Triangle();
		Rectangle rec = new Rectangle();
		
		tr.NameOfShape = "Triangle";
		rec.NameOfShape = "Rectangle";
		
		System.out.println("Enter Details of Triangle");
		System.out.println("Enter the length of base of triangle");
		tr.setLengthBase(sc.nextDouble());
		System.out.println("Enter the length of altitude of triangle");
		tr.setLengthAltitude(sc.nextDouble());
		
		
		System.out.println("Enter Details of Rectangle");
		System.out.println("Enter the length of Rectangle");
		rec.setRectangleLength(sc.nextDouble());
		System.out.println("Enter the breadth of Rectangle");
		rec.setRectangleBreadth(sc.nextDouble());
		
		tr.getDetails();
		rec.getDetails();
		
		sc.close();
		
	}

}
