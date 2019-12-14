
package ktm;

public class UserNode {
    
    String name;
    String password;
    String icnum;
    String phone;
    boolean status;
    int ticketid;
    UserNode next;
    
    public UserNode(){
        name=null;
        password=null;
        icnum=null;
        phone=null;
        ticketid=0;
        status=false;
        next=null;
    }
    
    public UserNode (String name, String icnumber, String phone, int ticketid){
        this.name=name;
        this.icnum=icnumber;
        this.phone=phone;
        this.ticketid=ticketid;
        this.status=true;
        next=null;
    } 


}
