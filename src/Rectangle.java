
public class Rectangle extends GeometricalFigure{
	private double length;
	private double breadth;
	
	public void setRectangleLength( double value )
	{
		length = value;
	}
	
	public void setRectangleBreadth( double value )
	{
		breadth = value;
	}
	public double areaCalculator()
	{
		System.out.println("Area calculation of Rectangle");
		return length * breadth;
	}
	
	public void getDetails()
	{
		System.out.println(super.NameOfShape);
		System.out.println("Area = "+areaCalculator());
	}

}
