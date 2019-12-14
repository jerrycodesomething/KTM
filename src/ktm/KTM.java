
package ktm;

import java.util.Scanner;

public class KTM{
    static int ui_state;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("---------- Welcome to KTM (Kereta api Tunggu Menunggu)  -----------");
        System.out.println("0- Login \n1- Book Ticket ");
        
        ui_state=s.nextInt();
        if(ui_state==0){
            System.out.println("login");
        }
        else{
            System.out.println("book");
        }
        
        Booking.bookMain();    
    }
    
}
