package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Canal canal = new Canal(1,"Internet");
		Customer customer = new IndividualCustomer(1,"121212",canal,"İbrahim","Kaplan","2223");
		System.out.println(customer.getId());
		System.out.println(customer.getCustomerNumber());
		System.out.println(customer.getCanal().getName());
		
		Customer customer2 = new CorporateCustomer(2,"1212",canal,"Kodlamaio","12121");
		System.out.println(customer2.getId());
		System.out.println(customer2.getCustomerNumber());
		System.out.println(customer2.getCanal().getName());
		
		CommercialActivity commercialActivity = new CommercialActivity(1,(IndividualCustomer)customer,
				LocalDate.parse("2022-07-25"));
		System.out.println(commercialActivity.getIndividualCustomer().getFirstName());
	}

}
