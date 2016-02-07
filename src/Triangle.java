
public class Triangle extends GeometricalFigure{
	private double lengthBase;
	private double lengthAltitude;
	
	public void setLengthBase( double value )
	{
		lengthBase = value;
	}
	
	public void setLengthAltitude( double value )
	{
		lengthAltitude = value;
	}
	
	public double areaCalculator()
	{
		System.out.println("Area Calculation of Triangle");
		return (0.5 * lengthBase * lengthAltitude);
	}
	
	public void getDetails()
	{
		System.out.println(super.NameOfShape);
		System.out.println("Area = "+areaCalculator());
	}
}
