/** Program:  4.2 circle distance
  * File:     circleDistance.java 
  * Summary:  measures a distance between 2 piont
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class circleDistance {

	public static void main(String[] args) {
		//Start Scanner for longitude and latitude
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		//average radius of the earth
		final double RADIUS = 63701.01; //constant RADIUS
		
		//convert to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		//print distance
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 * y2));
		System.out.println("The distance between the two points is " + distance + " km");
		

	}

}
