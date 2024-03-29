
package ktm;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//This class handles the "ticket booking" functions
public class Booking {
    //Booking Class Variables
    static String ui_state; 
    
    //Booking Methods
    public static void bookMain() throws IOException{
        System.out.println("------------- Available Travel Dates (2020)--------------");
        System.out.println("------------- Kuala Lumpur to Johor Bahru ----------------");
        System.out.println("\nPlease select options 1-7...");
        System.out.println("\n1- Wednesday Jan 1 (dep 12:00 arr 20:00) \n2- Thursday Jan 2 (dep 12:00 arr 20:00) \n3- Friday Jan 3 (dep 12:00 arr 20:00) \n4- Saturday Jan 4 (dep 12:00 arr 20:00) \n5- Sunday Jan 5 (dep 12:00 arr 20:00) \n6- Monday Jan 6 (dep 12:00 arr 20:00) \n7- Tuesday Jan 7 (dep 12:00 arr 20:00) \n0- back");
        bookingMenu();
    }
    
    //open subsequent booking prompt
    public static void bookingMenu() throws IOException{
        Scanner s= new Scanner(System.in);
        ui_state=s.nextLine();
        
        switch(ui_state){
            case "0":
                KTM.startMenu();
                break;
                
            case "1":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 1 January 2020 (dep 12:00 arr 20:00)-------");
                Train train= new Train();
                String confirmation="x";
                String waitlistconfirm="x";
                train.initializeSeats_Jan1();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain1File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date              Wednesday 1 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue1(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
                
            case "2":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 2 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan2();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain2File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Thursday 2 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        String ticketid=ticketidGenerator()+""+train.returnSeat();
                        int seat=train.returnSeat();
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue2(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
                
            case "3":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 3 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan3();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain3File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Friday 3 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue3(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
                
            case "4":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 5 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan4();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain4File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Saturday 4 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue4(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
            case "5":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 5 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan5();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain5File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Sunday 5 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue5(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
            case "6":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 6 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan6();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain6File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Monday 6 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue6(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;
            case "7":
                System.out.println("-------  Kuala Lumpur to Johor Bahru ------------");
                System.out.println("------ 7 January 2020 (dep 12:00 arr 20:00)-------");
                train= new Train();
                confirmation="x";
                waitlistconfirm="x";
                train.initializeSeats_Jan7();
                if(train.checkAvailability()>0){
                    System.out.println("\nAvailable Seats: "+train.checkAvailability()+"\n");
                    
                    String name;
                    String ic;
                    String phone;
                    String ticketid=ticketidGenerator()+""+train.returnSeat();
                    int seat=train.returnSeat();
                    boolean status=true;
                    
                    System.out.println("Enter Full Name:");
                    name=s.nextLine();
                    System.out.println("Enter IC Number:");
                    ic=s.nextLine();
                    if(train.checkSameDay(ic)==true){
                        System.out.println("YOU ALREADY HAVE A TICKET FOR THIS TRAIN!");
                        bookMain();
                        break;
                    }
                    System.out.println("Enter Phone Number");  
                    phone=s.nextLine();
                    
                    while(!confirmation.equalsIgnoreCase("y") || !confirmation.equalsIgnoreCase("n")){
                        System.out.println("Confirm Booking? Y/N");
                        confirmation=s.nextLine();
                        
                        if(confirmation.equalsIgnoreCase("y")){
                            try{
                                train.bookSeat(name, ic, phone, ticketid, seat, status);
                                train.updateTrain7File();
                            }
                            catch(IOException e){
                                System.out.println("Error 404! File Not Found!");
                            }

                            System.out.println("\nBooking Successful!");
                            System.out.println("-------------  Ticket Details -------------------");
                            System.out.println("Travel Date               Tuesday 6 January 2020");
                            System.out.println("Departing from                Kuala Lumpur(12:00)");
                            System.out.println("Arriving at                   Johor Bahru (20:00)");
                            System.out.println("\nPassenger Name: "+name);
                            System.out.println("Passenger IC Number: "+ic);
                            System.out.println("Seat:                                         "+seat);
                            System.out.println("Ticket ID: "+ticketid);
                            System.out.println("--------------------------------------------------\n\n"); 
                            KTM.startMenu();
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
                    System.out.println("Would you like to be added to the waiting list? Y/N");
                    waitlistconfirm=s.nextLine();
                    
                    if(waitlistconfirm.equalsIgnoreCase("y")){
                        System.out.println("Enter Full Name:");
                        String name=s.nextLine();
                        System.out.println("Enter IC Number:");
                        String ic=s.nextLine();
                        System.out.println("Enter Phone Number");  
                        String phone=s.nextLine();
                        
                        train.enqueue7(name, ic, phone);
                        System.out.println("You have been added to the waiting list...");
                        KTM.startMenu();
                        //train.showList2();
                    }
                    else if(waitlistconfirm.equalsIgnoreCase("n")){
                        bookMain();
                    }
                    else{
                        bookMain();
                    }
                }
                break;  
            default:
                System.out.println("Please select options 1-7 only!");
                bookingMenu();
        }
    }
    
    //generate ticketID
    public static String ticketidGenerator(){
        Random r=new Random();
        int randomid=r.nextInt(1000000000);
        return String.valueOf(randomid);      
    }
    
    
    
}
