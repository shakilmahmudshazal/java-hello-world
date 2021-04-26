package geometry;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area2 area = new Area2();
		double circleArea = area.areaOfCircle(23.00);
		
		System.out.print(circleArea);

	}

}


class Area2 {
	
	public Double PI=3.1416;
	
	public Double areaOfCircle(Double radius) {
		Double area = PI * radius * radius;
		return area;
	}
	
	public Double perimeterOfCircle(Double radius) {
		Double perimeter = 2* PI * radius;
		return perimeter;
	}
	
	
	
	

}