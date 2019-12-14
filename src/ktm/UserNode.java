
package ktm;

public class UserNode {
    
    String name;
    int icnum;
    int phone;
    int ticketid;
    UserNode next;
    
    public UserNode(){
        name=null;
        icnum=0;
        phone=0;
        ticketid=0;
        next=null;
    }
    
    public UserNode (String name, int icnumber, int phone, int ticketid){
        this.name=name;
        this.icnum=icnumber;
        this.phone=phone;
        this.ticketid=ticketid;
        next=null;
    } 
    
}
