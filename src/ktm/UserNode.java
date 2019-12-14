
package ktm;

public class UserNode {
    
    String name;
    String password;
    int icnum;
    int phone;
    int ticketid;
    UserNode next;
    
    public UserNode(){
        name=null;
        password=null;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIcnum() {
        return icnum;
    }

    public void setIcnum(int icnum) {
        this.icnum = icnum;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public UserNode getNext() {
        return next;
    }

    public void setNext(UserNode next) {
        this.next = next;
    }
    
    
    
}
