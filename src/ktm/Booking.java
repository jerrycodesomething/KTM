
package ktm;

import java.util.Scanner;


public class Booking {
    //Booking Class Variables
    
    //Booking Constructor
    
    //Booking Methods
    public static void bookMain(){
        System.out.println("------------- Travel Dates (2020)--------------");
        System.out.println("Please select options 1-7...");
        System.out.println("\n1- Wednesday Jan 1 \n2- Thursday Jan 2 \n3- Friday Jan 3 \n4- Saturday Jan 4 \n5- Sunday Jan 5 \n6- Monday Jan 6 \n7- Tuesday Jan 7");
    }
    
    public static void enterDetails(){
        Scanner s= new Scanner(System.in);
        String name;
        String ic;
        String phone;
        System.out.println("Enter Full Name:");
        name=s.nextLine();
        System.out.println("Enter IC Number:");
        ic=s.nextLine();
        System.out.println("Enter Phone Number");  
        phone=s.nextLine();
        
        User user= new User();
        user.addFirst(name, ic, phone, 0);
    }
    
    
    
}
