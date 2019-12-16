
package ktm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Train {
    //User Class Variables
    UserNode head;
    UserNode head2;
    UserNode tail2;
    UserNode tail;
    int size;
    
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
    public void updateTrain2File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan2.txt")));   
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
    public void updateTrain3File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan3.txt")));   
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
    public void updateTrain4File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan4.txt")));   
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
    public void updateTrain5File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan5.txt")));   
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
    public void updateTrain6File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan6.txt")));   
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
    public void updateTrain7File() throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Train_Jan7.txt")));   
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
    
    public void enqueue1(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List1.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List1.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue2(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List2.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List2.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue3(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List3.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List3.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue4(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List4.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List4.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue5(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List5.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List5.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue6(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List6.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List6.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    public void enqueue7(String name,String ic,String phone) throws IOException{
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List7.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            s.close();
        }    
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
            }   
        if(tail2==null){
            UserNode newnode= new UserNode(name, ic, phone);
            tail2=newnode;
            head2=newnode;
        }
        else{
            tail2.next=new UserNode(name, ic, phone);
            tail2=tail2.next;
        }
        
        PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List7.txt")));   
        UserNode current=head2;
        showList2();
        while(current!=null){
            pw.write(current.name);
            pw.write("\n" + current.ic);
            pw.write("\n" + current.phone+"\n");
            current=current.next;
        }
        pw.close();
    }
    
    
    public void dequeue1() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List1.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan1();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain1File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List1.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue2() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List2.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan2();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain2File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List2.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue3() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List3.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan3();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain3File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List3.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue4() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List4.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan4();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain4File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List4.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue5() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List5.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan5();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain5File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List5.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue6() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List6.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan6();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain6File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List6.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR 404 - File Not Found!");
        }
    }
    public void dequeue7() throws IOException{
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List7.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
            Train train= new Train();
            String ticketid=Booking.ticketidGenerator()+""+train.returnSeat();
            int seat=train.returnSeat();
            train.initializeSeats_Jan7();
            train.bookSeat(head2.name, head2.ic, head2.phone, ticketid, seat, true);
            train.updateTrain7File();
            
            head2=head2.next;
            UserNode current=head2;
            PrintWriter pw=new PrintWriter(new FileWriter(new File("Waiting_List7.txt")));   

            while(current!=null){
                pw.write(current.name);
                pw.write("\n" + current.ic);
                pw.write("\n" + current.phone);
                current=current.next;
            }
            pw.close();
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
    
    public void clearSeat(String ticketid){
        UserNode current=head;
        while(current!=null){
            if((current.ticketid).equals(ticketid)){
                current.name="< EMPTY >";
                current.ic="< EMPTY >";
                current.phone="< EMPTY >";
                current.ticketid="< EMPTY >";
                current.status=false;
                break;
            }
        current=current.next;    
        }  
    }
    
    public void editUser(String ticketid, String new_name, String new_ic, String new_phone){
        UserNode current=head;
        while(current!=null){
            if((current.ticketid).equals(ticketid)){
                current.name=new_name;
                current.ic=new_ic;
                current.phone=new_phone;
                break;
            }
        current=current.next;    
        }  
    }

    public void retrieveBooking(String ic, String ticketid){
        UserNode current= head;
        while(current!=null){
            if((current.ic).equals(ic) && (current.ticketid).equals(ticketid)){
                System.out.println("\nPassenger Name: "+current.name);
                System.out.println("Passenger IC Number: "+current.ic);
                System.out.println("Seat:                                         "+current.seat);
                System.out.println("Ticket ID: "+current.ticketid);   
                System.out.println("Booking Confirmed!");
            }
            current=current.next;
        }
    }
    
    public void retrieveStatus(String ic){
        UserNode current= head;
        while(current!=null){
            if((current.ic).equals(ic)){
                System.out.println("Ticket ID: "+current.ticketid);    
                System.out.println("Booking Confirmed!");
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
    
    public boolean checkTicket(String ic){
        UserNode current= head;
        boolean check=false;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    
    public boolean checkSameDay(String ic){
        UserNode current=head;
        boolean check=false;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;        
            }
            current=current.next;
        }
        return check;
    }
    
    public boolean checkFull(){
        boolean checkfull=false;
        int counter=0;
        UserNode current=head;
        while(current!=null){
            if((current.status)==true){
                counter++;
            }    
            current=current.next;
        }
        if(counter==20){
            checkfull=true;
        }
        return checkfull;
    }
    
    public int checkTrainToDelete(String ic, String ticketid){
        int breakcheck=0;
    
        initializeSeats_Jan1();
        UserNode current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=1;
            }
            current=current.next;
        }
        
        
        initializeSeats_Jan2();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=2;
            }
            current=current.next;
        }
        
        initializeSeats_Jan3();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=3;
            }
            current=current.next;
        }
        
        initializeSeats_Jan4();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=4;
            }
            current=current.next;
        }
        
        initializeSeats_Jan5();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=5;
            }
            current=current.next;
        }
        
        initializeSeats_Jan6();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=6;
            }
            current=current.next;
        }
        
        initializeSeats_Jan7();
        current=head;
        while(current!=null){
            if(ic.equals(current.ic) && ticketid.equals(current.ticketid)){
                breakcheck=7;
            }
            current=current.next;
        }
        
        return breakcheck;
    }
    
    public boolean checkWaiting1() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list1.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting2() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list2.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting3() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list3.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting4() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list4.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting5() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list5.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting6() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list6.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    public boolean checkWaiting7() throws IOException{
        boolean check=false;
        File file=new File("Waiting_list7.txt");
        if(file.length()==0){
            check=true;
        }
        return check;
    }
    
    public boolean checkWaitName1(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List1.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName2(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List2.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName3(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List3.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName4(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List4.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName5(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List5.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName6(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List6.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
                check=true;
                break;
            }
            current=current.next;
        }
        return check;
    }
    public boolean checkWaitName7(String ic){
        boolean check=false;
        head2=null;
        tail2=null;
        try{
            Scanner s= new Scanner(new FileInputStream("Waiting_List7.txt"));
            while(s.hasNextLine()){
                String name1=s.nextLine();
                String ic1=s.nextLine();
                String phone1=s.nextLine();
                
                if(tail2==null){
                    UserNode newnode= new UserNode(name1, ic1, phone1);
                    tail2=newnode;
                    head2=newnode;
                }
                else{
                    tail2.next=new UserNode(name1, ic1, phone1);
                    tail2=tail2.next;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error 404! File Not Found!");
        }
        UserNode current=head2;
        while(current!=null){
            if((current.ic).equals(ic)){
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
            System.out.println(current.ic);
            System.out.println(current.phone);
            System.out.println(current.ticketid);
            System.out.println(current.seat);
            System.out.println(current.status);
            current=current.next;
        }
        
    }
    
    public void showList2(){
        UserNode current= head2;
        while(current!=null){
            System.out.println(current.name);
            System.out.println(current.ic);
            System.out.println(current.phone);
            current=current.next;
        }
    }
}
