package p1;

import java.util.Scanner;

public class LazyDays {

	public static void main(String[] args) {
		
		int temp;
		boolean shop = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		temp = scan.nextInt();
		
		if(temp >= 80){
			System.out.println("Activity: Swimming.");
			if(temp > 95){
				shop = true;
			}
		}else if (60 <= temp && temp < 80){
			System.out.println("Activity: Tenis.");
		}else if(40 <= temp && temp < 60){
			System.out.println("Activity: Golf.");
		}else{
			System.out.println("Activity: Skiing.");
			if(temp < 20){
				shop = true;
			}
		}
		if(shop == true){
			System.out.println("Visit our shops!");
		}
	}

}
