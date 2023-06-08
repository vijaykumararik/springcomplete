package interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Value("852")
	private int cusid;
    @Value("kumar") 
    private String cusname;
    @Value("8529634146")
    private long pnum;
    @Autowired
    @Qualifier("savings")//in the lower case and when we have more the one 
                         // then one implementation  class 
    private Account account;
public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public long getPnum() {
	return pnum;
}
public void setPnum(long pnum) {
	this.pnum = pnum;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
@Override
public String toString() {
	return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", pnum=" + pnum + ", account=" + account + "]";
}

}
