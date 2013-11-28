package p1;

import java.util.Scanner;

public class Temps
{
	public static void main (String[] args)
	{
		final int HOURS_PER_DAY = 24;
		int temp;
		int maxTemp = -1000;
		int minTemp = 1000;
		int timeOfMax = -10;
		int timeOfMin = -10;
		
		Scanner scan = new Scanner(System.in);

		// print program heading
		System.out.println ();
		System.out.println ("Temperature Readings for 24 Hour Period");
		System.out.println ();
		
		for (int hour = 0; hour < HOURS_PER_DAY; hour++){
			System.out.print ("Enter the temperature reading at " + hour +
					" hours: ");
			temp = scan.nextInt();
			if(maxTemp < temp){
				maxTemp = temp;
				timeOfMax = hour;
			}
			if(minTemp > temp){
				minTemp = temp;
				timeOfMin = hour;
			}
		}
		System.out.println("Maximum temperature is " + maxTemp + " at the time of " +
				+ timeOfMax + " hours.");
		System.out.println("Minimum temperature is " + minTemp + " at the time of " +
				+ timeOfMin + " hours.");
	}
}
