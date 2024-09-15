package main01;

public class Receipts {
    
String name;
     String name2;
     String prodname;
     int qua;
     int price;
     double cash;
     
    public void getadd(){
        
        System.out.println("Name: "+name+name2);
        System.out.println("Item: "+prodname);
        System.out.println("Quantity: "+qua);
        
    }
    
    public void getTotal(){
        System.out.println("--------------------------------");
        System.out.println("Total Due: "+(qua * price));
        System.out.println("Cash: "+(cash));
        
        System.out.println("\n------------------------------");
        System.out.println("\nChange: "+(cash-(qua*price)));
        System.out.println("\n-------------------------------");
        
}
}

