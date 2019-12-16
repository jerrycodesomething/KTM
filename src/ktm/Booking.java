
package ktm;

import java.util.Random;
import java.util.Scanner;


public class Booking {
    //Booking Class Variables
    static String ui_state; 
    static int idcounter=0;
    
//Booking Constructor
    
    //Booking Methods
    public static void bookMain(){
        System.out.println("------------- Available Travel Dates (2020)--------------");
        System.out.println("------------- Kuala Lumpur to Johor Bahru ----------------");
        System.out.println("\nPlease select options 1-7...");
        System.out.println("\n1- Wednesday Jan 1 \n2- Thursday Jan 2 \n3- Friday Jan 3 \n4- Saturday Jan 4 \n5- Sunday Jan 5 \n6- Monday Jan 6 \n7- Tuesday Jan 7");
        bookingMenu();
    }
    
    public static void bookingMenu(){
        Scanner s= new Scanner(System.in);
        ui_state=s.nextLine();
        
        switch(ui_state){
            case "1":
                User user= new User();
                user.initializeSeats_Jan1();
                String name;
                String ic;
                String phone;
                String ticketid=ticketidGenerator();
                boolean status=true;
                
                System.out.println("Enter Full Name:");
                name=s.nextLine();
                System.out.println("Enter IC Number:");
                ic=s.nextLine();
                System.out.println("Enter Phone Number");  
                phone=s.nextLine();
                
                user.bookSeat(name, ic, phone, ticketid, status);
                user.showList();
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "7":
                System.out.println("7");
                break;  
            default:
                System.out.println("Please select options 1-7 only!");
                bookingMenu();
        }
    }
    
    
    public static String ticketidGenerator(){
        Random r=new Random();
        int randomid=r.nextInt(1000);
        idcounter++;
        return String.valueOf(randomid)+String.valueOf(idcounter);        
    }
    
    
    
}
