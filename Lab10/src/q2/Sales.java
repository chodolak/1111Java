package q2;

import java.util.Scanner;

public class Sales {
    
    public static void main(String[] args) {
        
        int SALESPEOPLE;
        int sum;
        int max = 0;
        int min = 100000000;
        int personmax = 0;
        int personmin = 0;
        int value;
        int all = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the amount of salespeople: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE + 1];
        
        for (int i=1; i<sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        
        for (int i=1; i<sales.length; i++) {
            System.out.println(" " + i + " $" + sales[i]);
            sum += sales[i];
            if(sales[i] > max){
                max = sales[i];
                personmax = i;
            }
            
            if(sales[i] < min){
                min = sales[i];
                personmin = i;
            }
        }
        
        System.out.println("\nTotal sales: $" + sum);
        System.out.println("Average of sales: " + (sum / sales.length));
        System.out.println("Salesperson " + personmax + " had the highest sale with $" + max);
        System.out.println("Salesperson " + personmin + " had the lowest sale with $" + min);
        
        System.out.println("\nEnter a value:");
        value = scan.nextInt();
        
        for (int i=1; i<sales.length; i++) {
            if(value < sales[i]){
                System.out.println("Salesperson " + i + " exceeded the value of $" + value + " with $" + sales[i]);
                all++;
            }
        }
        System.out.println("Number of salespeople to go over the value: " + all);
    }
}