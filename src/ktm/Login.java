
package ktm;

import java.util.Scanner;

public class Login {
    private static boolean account_existence=true;
    static String ui_state;
    
    public static void loginMain(){
        Scanner s= new Scanner(System.in);
        String ic;
        String ticketid;
        
        System.out.println("Please enter your IC NUMBER and TICKET ID ");
        System.out.println("IC Number: ");
        ic=s.nextLine();
        System.out.println("Ticket ID");
        ticketid=s.nextLine();
        
        checkAccount(ic, ticketid);
        if(account_existence==true){
            System.out.println("\nWhat would you like to do? ");
            System.out.println("Please select options 1-3...");
            System.out.println("\n1- view ticket/s \n2- edit details \n3- cancel booking");
            ui_state=s.nextLine();
            
            switch (ui_state){
                case "1":
                    viewTicket(ic, ticketid);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:    
                    System.out.println("Please select options 1-3 only!");
            }
        }
    }
    
    public static void viewTicket(String ic, String ticketid){
        Train train= new Train();
        train.initializeSeats_Jan1();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan2();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan3();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan4();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan5();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan6();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan7();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        }    
    }
    
    public static void checkAccount(String ic, String ticketid){
        Train train= new Train();
        account_existence=false;
        while(account_existence==false){
            train.initializeSeats_Jan1();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan2();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan3();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan4();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan5();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan6();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            train.initializeSeats_Jan7();
            if((train.checkBooking(ic, ticketid))==true){
                System.out.println("-----------------------------------------");
                System.out.println("Welcome back "+train.getName(ic)+"!");
                account_existence=true;
                break;
            }
            break;
        }
        if(account_existence==false){
            System.out.println("Ticket Does Not Exist!\n");
            loginMain();
        }
    }
    

   
}
