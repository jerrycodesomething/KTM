
package ktm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Train {
    //User Class Variables
    UserNode head;
    UserNode tail;
    int size;
    
    //User Constructor

    
    //User Methods
    public void initializeSeats_Jan1(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan1.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan2(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan2.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan3(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan3.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan4(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan4.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan5(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan5.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan6(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan6.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void initializeSeats_Jan7(){
        head=null;
        tail=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan7.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                int seat=Integer.parseInt(s.nextLine());
                boolean status=Boolean.parseBoolean(s.nextLine());
                
                addLast(name, ic, phone, ticketid, seat, status);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    
    public void addLast(String name, String ic, String phone, String ticketid, int seat, boolean status){
        if(tail==null){
            UserNode newnode= new UserNode(name, ic, phone, ticketid, seat, status);
            tail=newnode;
            head=newnode;
        }
        else{
            tail.next=new UserNode(name, ic, phone, ticketid, seat, status);
            tail=tail.next;
        }
        size++;
    }
    
    public void bookSeat(String name, String ic, String phone, String ticketid, int seat, boolean status){
        UserNode current= head;
        while(current!=null){
            if(current.status==false){
                current.name=name;
                current.ic=ic;
                current.phone=phone;
                current.ticketid=ticketid;
                current.status=status;
                break;
            }
            current=current.next;  
        }
    }
    
    public void updateTrain1File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan1.txt")));   
        UserNode current=head;
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone);
            pw.write("\n" + current.ticketid);
            pw.write("\n"+current.seat);
            pw.write("\n"+ current.status +"\n");
            current=current.next;
        }
        pw.close();
    }

    public void retrieveBooking(String ic, String ticketid){
        UserNode current= head;
        while(current!=null){
            if((current.ic).equals(ic) && (current.ticketid).equals(ticketid)){
                System.out.println("\nPassenger Name: "+current.name);
                System.out.println("Passenger IC Number: "+current.ic);
                System.out.println("Seat:                                         "+current.seat);
                System.out.println("Ticket ID: "+current.ticketid);    
            }
            current=current.next;
        }
    }
    
    public boolean checkBooking(String ic, String ticketid){
        UserNode current= head;
        boolean check=false;
        while(current!=null){
            if((current.ic).equals(ic) && (current.ticketid).equals(ticketid)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    
    public int checkAvailability(){
        int booking_availability=20;
        UserNode current= head;
        while(current!=null){
            if(current.status==true){
                booking_availability--;
            }
            current=current.next;
        }
        return booking_availability;
    }
    
    public int returnSeat(){
        UserNode current=head;
        int seat_no=0;
        while(current!=null){
            if(current.status==false){
                seat_no=current.seat;
                break;
            }
            current=current.next;
        }
        return seat_no;
    }
    
    public String getName(String ic){
        UserNode current= head;
        String name=null;
        while(current!=null){
            if((current.ic).equals(ic)){
                name=current.name;
            }
            current=current.next;
        }
        return name;  
    }
   
    public void showList(){
        UserNode current= head;
        while(current!=null){
            System.out.println(current.name);
            System.out.println(current.status);
            current=current.next;
        }
        
    }
}
