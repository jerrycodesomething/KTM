
package ktm;

import java.io.IOException;
import java.util.Scanner;

//This class handles the "check ticket status" functions
public class Status {
    //Status class variables
    static String ic;
    
    //main prompt to prompt ticket status menu
    public static void statusMain() throws IOException{
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter your IC NUMBER...");
        System.out.println("IC Number: ");
        ic=s.nextLine();
        
        viewTicket(ic);
        System.out.println("enter to continue...");
        s.nextLine();
        KTM.startMenu();
    }
    
    //method to check status of ticket with brief details
    public static void viewTicket(String ic){
        Train train= new Train();
        train.initializeSeats_Jan1();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Wednesday 1 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------"); 
        } 
        train.initializeSeats_Jan2();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Thursday 2 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan3();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date                 Friday 3 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan4();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Saturday 4 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan5();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Sunday 5 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan6();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Monday 6 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        } 
        train.initializeSeats_Jan7();
        if(train.checkTicket(ic)==true){
            System.out.println("-------------  Ticket Details -------------------");
            System.out.println("Travel Date              Tuesday 7 January 2020");
            train.retrieveStatus(ic);
            System.out.println("--------------------------------------------------\n"); 
        }
        if(train.checkWaitName1(ic)==true){
            System.out.println("You are still in the waiting list for 1 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName2(ic)==true){
            System.out.println("You are still in the waiting list for 2 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName3(ic)==true){
            System.out.println("You are still in the waiting list for 3 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName4(ic)==true){
            System.out.println("You are still in the waiting list for 4 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName5(ic)==true){
            System.out.println("You are still in the waiting list for 5 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName6(ic)==true){
            System.out.println("You are still in the waiting list for 6 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
        if(train.checkWaitName7(ic)==true){
            System.out.println("You are still in the waiting list for 7 January 2020");
            System.out.println("--------------------------------------------------"); 
        }
    }
}
