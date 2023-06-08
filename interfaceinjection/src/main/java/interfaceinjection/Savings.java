package interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	public void withdraw() {
		System.out.println("Amount is withdrawn");
		
	}

	public void deposit() {
       System.out.println("amount is deposited");		
	}

}
