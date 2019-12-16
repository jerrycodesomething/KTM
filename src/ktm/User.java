
package ktm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class User {
    //User Class Variables
    UserNode head;
    UserNode tail;
    int size;
    
    //User Constructor

    
    //User Methods
    public void initializeSeats_Jan1(){
        try{
            Scanner s= new Scanner(new FileInputStream("users.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                boolean status=Boolean.parseBoolean(s.nextLine());    
                
                addLast(name, ic, phone, ticketid, status);         
            }
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    
    public void addLast(String name, String ic, String phone, String ticketid, boolean status){
        if(tail==null){
            UserNode newnode= new UserNode(name, ic, phone, ticketid, status);
            tail=newnode;
            head=newnode;
        }
        else{
            tail.next=new UserNode(name, ic, phone, ticketid, status);
            tail=tail.next;
        }
        size++;
    }
    
    public void bookSeat(String name, String ic, String phone, String ticketid, boolean status){
        UserNode current= head;
        while(current!=null){
            if(current.status=false){
                current.name=name;
                current.ic=ic;
                current.phone=phone;
                current.ticketid=ticketid;
                current.status=status;
                break;
            }
        }
    }
    
    public void showList(){
        UserNode current= head;
        int count=0;
        while(current!=null){
            System.out.println(count+"hi");
            System.out.println(current.name);
            current=current.next;
            count++;
        }
        
    }
    

}
