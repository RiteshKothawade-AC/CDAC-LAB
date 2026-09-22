
public class Polygonmain {
	public static void main(String[] args)
	{
	EquilateralTriangle t = new EquilateralTriangle(5);

	Square s = new Square(10);
	
	System.out.println(t.getNumSides());
	
	System.out.println( t.getSideLength());
	
	System.out.println(s.getNumSides());

    System.out.println(s.getSideLength());
    
    RegularPolygon[] arr= {t,s};
    
    System.out.println(RegularPolygon.totalSides(arr));
    
    System.out.println(t.getPerimeter());
    
    System.out.println(s.getPerimeter());
    
    System.out.println(t.getInteriorAngle());
    
    System.out.println(s.getInteriorAngle());
	}
}
