
package ktm;

//This class is the Node class for the linked lists
public class UserNode {
    //UserNode class variables
    String name;
    String ic;
    String phone;
    String ticketid;
    int seat;
    boolean status;
    UserNode next;
    
    //Empty constructor for nodes
    public UserNode(){
        this.name=null;
        this.ic=null;
        this.phone=null;
        this.ticketid=null;
        this.seat=0;
        this.status=false;
        this.next=null;
    }
    
    //Constructor used for the queue with linked list implementation for the waiting lists
    public UserNode(String name, String ic, String phone){
        this.name=name;
        this.ic=ic;
        this.phone=phone;
    }
    
    //Constructor used for the linked list for "booked/booking" tickets
    public UserNode(String name, String ic, String phone, String ticketid, int seat, boolean status){
        this.name=name;
        this.ic=ic;
        this.phone=phone;
        this.ticketid=ticketid;
        this.seat=seat;
        this.status=status;
        this.next=null;
    }
}
