
package ktm;


public class User {
    //User Class Variables
    UserNode head;
    UserNode tail;
    int size;
    
    //User Constructor

    //User Methods
    public void initializeSeats(){
        
    }
    
    public void addFirst(String name, String ic, String phone, String ticketid){
        UserNode newnode= new UserNode(name, ic, phone, ticketid);
        newnode.next=head;
        head=newnode;
        size++;
        if(tail==null){
            tail=head;
        }
    }
    

}
