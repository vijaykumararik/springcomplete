package Interface2inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Value("rama")
	private String managername;
    @Autowired
    @Qualifier("employee1")
    private Company company;
    @Autowired
    @Qualifier("employee2")
    private Company company1;
public String getManagername() {
	return managername;
}
public void setManagername(String managername) {
	this.managername = managername;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}

public Company getCompany1() {
	return company1;
}
public void setCompany1(Company company1) {
	this.company1 = company1;
}
@Override
public String toString() {
	return "Manager [managername=" + managername + ", company=" + company + ", company1=" + company1 + "]";
}

}
