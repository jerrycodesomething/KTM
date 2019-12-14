
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIcnum(int icnum) {
        this.icnum = icnum;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getIcnum() {
        return icnum;
    }

    public int getPhone() {
        return phone;
    }

    public int getTicketid() {
        return ticketid;
    }

}
