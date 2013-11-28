package p1;

import java.util.Scanner;

public class Dates
{

	public static void main(String[] args)
	{
		int month, day, year;
		int daysInMonth;
		boolean monthValid = false;
		boolean yearValid = false;
		boolean dayValid = false;
		boolean leapYear = false;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter day: ");
		day = scan.nextInt();
		System.out.println("Enter month: ");
		month = scan.nextInt();
		System.out.println("Enter year: ");
		year = scan.nextInt();
		
		// Looks if month is valid
		if(month >= 1 && month <= 12){
			monthValid = true;
		}
		// Looks if year is valid
		if(year >= 1000 && year <= 1999){
			yearValid = true;
		}
		// Looks if it is a leap year
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			leapYear = true;
		}
		// Sets days in month
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12){
			daysInMonth = 31;
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			daysInMonth = 30;
		}else if(month == 2 && leapYear == false){
			daysInMonth = 29;
		}else{
			daysInMonth = 28;
		}
		
		if(month < 1 || month > 12){
			daysInMonth = 0;
		}
		if(day <= daysInMonth){
			dayValid = true;
		}
		if(yearValid == true && monthValid == true && dayValid == true){
			System.out.println("Date is valid!");
			System.out.println("Leap year: " + leapYear);
		}else{
			System.out.println("Date is invalid.");
		}
	}
}
