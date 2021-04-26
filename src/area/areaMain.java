package area;

public class areaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area areaObject = new Area();
		int r =4;
		
		Double newCircleArea = areaObject.areaOfCircle(Double.valueOf(r));
		Double pi = areaObject.PI;
		
		System.out.println("Area of circle by Sumaiya: "+newCircleArea);
		System.out.println("perimeter of circle by Sumaiya: "+areaObject.perimeterOfCircle(12.00));
		System.out.println("Area of Rectangle by Sumaiya: "+areaObject.areaOfRectangle(12.00, 11.00));
		System.out.println("perimeter of circle by Sumaiya: "+areaObject.perimeterOfRectangle(12.00, 11.00));
		

	}

}


