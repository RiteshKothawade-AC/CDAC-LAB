
public class EquilateralTriangle implements RegularPolygon{
	private double sideLength;
	
	EquilateralTriangle(double sideLength)
	{
		this.sideLength=sideLength;
	}
	public int getNumSides()
	{
		return 3;
	}
	public double getSideLength()
	{
		return sideLength;
	}
	
}
