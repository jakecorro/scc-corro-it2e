
package corroj;

import java.util.Scanner;


public class Sales {
    
    public void getSales(){
    
            Scanner input = new Scanner(System.in);
        
        System.out.print("Customer Name: ");
        String Customer = input.nextLine();
        System.out.print("Product Name: ");
        String Product = input.nextLine();
        System.out.print("Quantity: ");
        int Quant = input.nextInt();
        System.out.print("Price: ");
        int Price = input.nextInt();
        System.out.print("Cash: ");
        int Cash = input.nextInt();
        
        System.out.println("\n------------------------");
        System.out.println("RECEIPT");
        System.out.println("--------------------------");
        
        System.out.println("Name: "+Customer);
        System.out.println("Item: "+Product);
        System.out.println("Quantity: "+Quant);
        System.out.println("---------------------------");
        System.out.println("Total Due: "+(Quant*Price));
        System.out.println("Cash: "+(Cash));
        System.out.println("---------------------------");
        System.out.println("Change : "+(Cash-(Quant*Price)));
        System.out.println("-----------------------------");
    }
    
}
