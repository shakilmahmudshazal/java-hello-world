package area;

public class Area {
	
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
