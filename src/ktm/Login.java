
package ktm;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    private static boolean account_existence=true;
    static String ui_state="x";
    static String ic;
    static String ticketid;
    
    public static void loginMain() throws IOException {
        Scanner s= new Scanner(System.in);
        System.out.println("press 'Enter' to continue login process     or      enter 'X' to exit");
        if(s.nextLine().equals("x")){
            KTM.startMenu();
        }
        System.out.println("Please enter your IC NUMBER and TICKET ID... ");
        System.out.println("IC Number: ");
        ic=s.nextLine();
        System.out.println("Ticket ID");
        ticketid=s.nextLine();
        
        checkAccount(ic, ticketid);
        loginMenu();
    }
    
    public static void loginMenu() throws IOException{
        Scanner s=new Scanner(System.in);
        if(account_existence==true){
            while(!ui_state.equals("1") || !ui_state.equals("2") || !ui_state.equals("3")){
                System.out.println("\nWhat would you like to do? ");
                System.out.println("Please select options 1-3...");
                System.out.println("\n1- view ticket/s \n2- edit details \n3- cancel booking \n0- back");
                ui_state=s.nextLine();

                switch (ui_state){
                    case "0":
                        loginMain();
                        break;
                    case "1":
                        viewTicket(ic, ticketid);
                        ui_state="x";
                        break;
                    case "2":
                        editTicket(ticketid);
                        ui_state="x";
                        break;
                    case "3":
                        deleteTicket(ticketid);
                        Train train=new Train();
                        if(train.checkWaiting1()==false){
                            train.dequeue1();
                        }
                        KTM.startMenu();
                        break;
                    default:    
                        System.out.println("Please select options 1-3 only!");
                }
            }
        }
    }
    
    public static void viewTicket(String ic, String ticketid){
        Train train= new Train();
        train.initializeSeats_Jan1();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Wednesday 1 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan2();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Thursday 2 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan3();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Friday 3 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan4();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Saturday 4 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan5();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Sunday 5 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan6();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Monday 6 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        } 
        train.initializeSeats_Jan7();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Tuesday 7 January 2019");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n\n"); 
        }    
    }
    
    public static void editTicket(String ticketid) throws IOException{
        Scanner s= new Scanner(System.in);
        String check="x";
        String name;
        String ic;
        String phone;
        
        System.out.println("Re-enter your name: ");
        name=s.nextLine();
        System.out.println("Re-enter your IC number: ");
        ic=s.nextLine();
        System.out.println("Re-enter your phone number");
        phone=s.nextLine();
        System.out.println("Confirm changes? Y/N");
        check=s.nextLine();
        
        if(check.equalsIgnoreCase("y")){
            Train train= new Train();
            train.initializeSeats_Jan1();
            train.editUser(ticketid, name, ic, phone);
            train.updateTrain1File();    
            System.out.println("Updated details successfully saved!");
            System.out.println("---------------------------------------------------------------");
            
        }
        else if(check.equalsIgnoreCase("n")){
            editTicket(ticketid);
        }
        else{
            System.out.println("Please select Y/N only!");
            editTicket(ticketid);
        }
    }
    
    public static void deleteTicket(String ticketid) throws IOException{
        Scanner s=new Scanner (System.in);
        String check="x";
        Train train=new Train();
        int breakcheck=train.checkTrainToDelete(ic, ticketid);
        
        System.out.println("Are you sure you want to cancel your booked ticket? Y/N");
        check=s.nextLine();
        if(check.equalsIgnoreCase("y")){
            switch(breakcheck){
                case 1:
                    train= new Train();
                    train.initializeSeats_Jan1();
                    train.clearSeat(ticketid);
                    train.updateTrain1File();
                    break;
                case 2:
                    train.initializeSeats_Jan2();
                    train.clearSeat(ticketid);
                    train.updateTrain2File();
                    break;
                case 3:    
                    train.initializeSeats_Jan3();
                    train.clearSeat(ticketid);
                    train.updateTrain3File();
                    break;
                case 4:    
                    train.initializeSeats_Jan4();
                    train.clearSeat(ticketid);
                    train.updateTrain4File();
                    break;
                case 5:
                    train.initializeSeats_Jan5();
                    train.clearSeat(ticketid);
                    train.updateTrain5File();
                    break;
                case 6:
                    train.initializeSeats_Jan6();
                    train.clearSeat(ticketid);
                    train.updateTrain6File();
                    break;
                case 7:    
                    train.initializeSeats_Jan7();
                    train.clearSeat(ticketid);
                    train.updateTrain7File();
                    break;
                default:
                     System.out.println("Nothing was deleted...");
            }
            System.out.println("BOOKING HAS BEEN CANCELLED.");
            System.out.println("---------------------------------------------------------------");
        }
        else if(check.equalsIgnoreCase("n")){
            loginMenu();
        }
        else{
            System.out.println("Please select Y/N only!");
            deleteTicket(ticketid);
        }
    }
    
    public static void checkAccount(String ic, String ticketid) throws IOException{
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
