package helloWorld;

import area.Area;

public class encapsulationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area areaObject = new Area();
		int r =4;
		
		Double newCircleArea = areaObject.areaOfCircle(Double.valueOf(r));
		Double pi = areaObject.PI;
		
		System.out.println("Area of circle by Sumaiya: "+newCircleArea);


	}

}
