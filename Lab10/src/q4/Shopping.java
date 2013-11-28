package q4;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        String run = "y";
        String skip;
        int count = 0;
        ShoppingCart list = new ShoppingCart();
        
        do{
            System.out.println("Enter item name:");
            name = scan.nextLine();
            System.out.println("Enter item price:");
            price = scan.nextDouble();
            System.out.println("Enter item quantity:");
            quantity = scan.nextInt();
    
            list.addToCart(name, price, quantity);
            System.out.println(list.toString());
            System.out.println ("Continue shopping (y/n)? ");
            run = scan.next();
        
                if (run.equalsIgnoreCase("n")){
                    System.out.println("Total price: " + list.getTotalPrice());
                }
            skip = scan.nextLine();
        }
       while (run.equals("y"));
                
  }

}
