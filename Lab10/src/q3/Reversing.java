package q3;

import java.util.Scanner;

public class Reversing {
    
    public static void main(String[] args) {
        
        int value;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a integer: ");
        value = scan.nextInt();
        
        int[] reverse = new int[value];
        
        for (int i=0; i<reverse.length; i++) {
            System.out.print("Enter value " + i + ": ");
            reverse[i] = scan.nextInt();
        }
        
        for (int go : reverse) {
            System.out.print(go + "  ");
        }
        
        for(int i = 0; i < reverse.length / 2; i++){
            int temp = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = temp;
        }
        
        System.out.println();
        for (int gogo : reverse){
            System.out.print(gogo + "  ");
        }
    }

}
