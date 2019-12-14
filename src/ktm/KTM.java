
package ktm;

import java.util.Scanner;

public class KTM{
    static String ui_state;

    public static void main(String[] args) {
        System.out.println("---------- Welcome to KTM (Kereta api Tunggu Menunggu)  -----------");
        startMenu();
        
            
    }
    
    public static void startMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("0- Login \n1- Book Ticket ");
        
        ui_state=s.next();
        if(ui_state.equals("0")){
            System.out.println("login");
        }
        else if(ui_state.equals("1")){
            System.out.println("book");
            Booking.bookMain();
        }
        else{
            System.out.println("\nPlease select options 0 or 1 only!");
            startMenu();
        }
    }
    
    
    
    
    
    
    
}
