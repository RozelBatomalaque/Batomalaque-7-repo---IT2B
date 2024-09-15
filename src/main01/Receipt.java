package main01;

import java.util.Scanner;

public class Receipt {
    public void getreceipt(){
        
        Scanner input = new Scanner(System.in);
        String fname,pname;
        
        int quan, price, cash, totald,change;
        
        System.out.println("Customer name:");
        fname = input.nextLine();
        
        System.out.println("Product Name:");
        pname = input.nextLine();
        
        System.out.println("Quantity:");
        quan = input.nextInt();
        
        System.out.println("Price:");
        price = input.nextInt();
        
        System.out.println("Cash:");
        cash = input.nextInt();
        Receipt rc = new Receipt();
       
        
    }
    
}