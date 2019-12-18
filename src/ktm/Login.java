
package ktm;

import java.io.IOException;
import java.util.Scanner;

//This class handles the login operations which allow users to view, edit, and delete their tickets
public class Login {
    //Login class variables
    private static boolean account_existence=true;
    static String ui_state="x";
    static String ic;
    static String ticketid;
    
    //opens the main login prompt
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
    
    //subsequent login prompt
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
                        KTM.startMenu();
                        break;
                    default:    
                        System.out.println("Please select options 1-3 only!");
                }
            }
        }
    }
    
    //method to view the details for a particular ticket across 7 trains
    public static void viewTicket(String ic, String ticketid){
        Train train= new Train();
        train.initializeSeats_Jan1();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Wednesday 1 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------"); 
        } 
        train.initializeSeats_Jan2();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Thursday 2 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan3();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Friday 3 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan4();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Saturday 4 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan5();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Sunday 5 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan6();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Monday 6 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan7();
        if((train.checkBooking(ic, ticketid))==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Tuesday 7 January 2020");
            System.out.println("Departing from                Kuala Lumpur(12:00)");
            System.out.println("Arriving at                   Johor Bahru (20:00)");
            train.retrieveBooking(ic, ticketid);
            System.out.println("--------------------------------------------------\n"); 
        }    
    }
    
    //edit passenger particulars for certain ticket
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
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain1File();    
            }
            train.initializeSeats_Jan2();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain2File();    
            }
            train.initializeSeats_Jan3();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain3File();    
            }
            train.initializeSeats_Jan4();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain4File();    
            }
            train.initializeSeats_Jan5();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain5File();    
            }
            train.initializeSeats_Jan6();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain6File();    
            }
            train.initializeSeats_Jan7();           
            if(ticketid.equals(train.getTicketID(ticketid))){
                train.editUser(ticketid, name, ic, phone);
                train.updateTrain7File();    
            }
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
    
    //deletes ticket
    public static void deleteTicket(String ticketid) throws IOException{
        Scanner s=new Scanner (System.in);
        String check="x";
        Train train=new Train();
        
        System.out.println("Are you sure you want to cancel your booked ticket? Y/N");
        check=s.nextLine();
        
        if(check.equalsIgnoreCase("y")){
            int breakcheck=train.checkTrainToDelete(ic, ticketid);
            boolean checkfull=false;
            
            if(breakcheck==1){
                train= new Train();
                train.initializeSeats_Jan1();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain1File();
                if(checkfull==true){
                    if(train.checkWaiting1()==false){
                        train.dequeue1();
                    }    
                }
            }
            if(breakcheck==2){
                train= new Train();
                train.initializeSeats_Jan2();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain2File();
                if(checkfull==true){
                    if(train.checkWaiting2()==false){
                        train.dequeue2();
                    }  
                }
            }
            if(breakcheck==3){
                train= new Train();
                train.initializeSeats_Jan3();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain3File();
                if(checkfull==true){
                    if(train.checkWaiting3()==false){
                        train.dequeue3();
                    }  
                }
            }
            if(breakcheck==4){
                train= new Train();
                train.initializeSeats_Jan4();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain4File();
                if(checkfull==true){
                    if(train.checkWaiting4()==false){
                        train.dequeue4();
                    }  
                }
            }
            if(breakcheck==5){
                train= new Train();
                train.initializeSeats_Jan4();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain4File();
                if(checkfull==true){
                    if(train.checkWaiting5()==false){
                        train.dequeue5();
                    }  
                }
            }
            if(breakcheck==6){
                train= new Train();
                train.initializeSeats_Jan6();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain6File();
                if(checkfull==true){
                    if(train.checkWaiting6()==false){
                        train.dequeue6();
                    }  
                }
            }
            if(breakcheck==7){
                train= new Train();
                train.initializeSeats_Jan7();
                checkfull=train.checkFull();
                train.clearSeat(ticketid);
                train.updateTrain7File();
                if(checkfull==true){
                    if(train.checkWaiting7()==false){
                        train.dequeue7();
                    }  
                }
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
    
    //check if booked ticket exists 
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
