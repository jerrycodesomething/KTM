
package ktm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Booking {
    //Booking Class Variables
    static String ui_state; 
    
//Booking Constructor
    
    //Booking Methods
    public static void bookMain(){
        System.out.println("------------- Available Travel Dates (2020)--------------");
        System.out.println("------------- Kuala Lumpur to Johor Bahru ----------------");
        System.out.println("\nPlease select options 1-7...");
        System.out.println("\n1- Wednesday Jan 1 (dep 12:00 arr 20:00) \n2- Thursday Jan 2 (dep 12:00 arr 20:00) \n3- Friday Jan 3 (dep 12:00 arr 20:00) \n4- Saturday Jan 4 (dep 12:00 arr 20:00) \n5- Sunday Jan 5 (dep 12:00 arr 20:00) \n6- Monday Jan 6 (dep 12:00 arr 20:00) \n7- Tuesday Jan 7 (dep 12:00 arr 20:00) \n0- back");
        bookingMenu();
    }
    
    public static void bookingMenu(){
        Scanner s= new Scanner(System.in);
        ui_state=s.nextLine();
        
        switch(ui_state){
            case "0":
                KTM.startMenu();
                KTM.clearConsole();
                break;
                
            case "1":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ January 1 (dep 12:00 arr 20:00)-----------");
                Train1 user= new Train1();
                String confirmation="x";
                user.initializeSeats_Jan1();
                if(user.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+user.checkAvailability()+"\n");
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+user.returnSeat();
                    int seat=user.returnSeat();
                    boolean status=true;
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equals("y") || !confirmation.equals("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                user.bookSeat(name, ic, phone, ticketid, seat, status);
                                user.updateTrain1File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("Booking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date              Wednesday 1 January 2019");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------"); 
                            break;
                        }
                        else if(confirmation.equalsIgnoreCase("n")){
                            System.out.println("Booking Cancelled... Please select a travel date!");
                            bookMain();
                            break;
                        }
                        else{
                            System.out.println("Please sellect Y or N only!");
                        }
                    }
                }
                else{
                    System.out.println("Sorry, this train is FULLY BOOKED...  ");
                    System.out.println("Would you like to be added to the waiting list?");
                }
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
        return String.valueOf(randomid);      
    }
    
    
    
}
