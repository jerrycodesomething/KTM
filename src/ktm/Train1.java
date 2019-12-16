
package ktm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Train1 {
    //User Class Variables
    UserNode head;
    UserNode tail;
    int size;
    
    //User Constructor

    
    //User Methods
    public void initializeSeats_Jan1(){
        try{
            Scanner s= new Scanner(new FileInputStream("Train_Jan1.txt"));
            while(s.hasNextLine()){
                String name=s.nextLine();
                String ic=s.nextLine();
                String phone=s.nextLine();
                String ticketid=s.nextLine();
                boolean status=Boolean.parseBoolean(s.nextLine());    
                
                addLast(name, ic, phone, ticketid, status);
            }
            s.close();
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
    
    public void updateTrainFile() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan1.txt")));   
        UserNode current=head;
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone);
            pw.write("\n" + current.ticketid);
            pw.write("\n"+ current.status +"\n");
            current=current.next;
        }
        pw.close();
    }
    
    public void showList(){
        UserNode current= head;
        int count=0;
        while(current!=null){
            System.out.println(count);
            System.out.println(current.name);
            System.out.println(current.status);
            current=current.next;
            count++;
        }
        
    }
}
