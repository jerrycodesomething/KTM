
package ktm;


public class UserNode {
    String name;
    String ic;
    String phone;
    String ticketid;
    boolean status;
    UserNode next;
    
    public UserNode(){
        this.name=null;
        this.ic=null;
        this.phone=null;
        this.ticketid=null;
        this.status=false;
        this.next=null;
    }
    
    public UserNode(String name, String ic, String phone, String ticketid, boolean status){
        this.name=name;
        this.ic=ic;
        this.phone=phone;
        this.ticketid=ticketid;
        this.status=status;
        this.next=null;
    }
}
