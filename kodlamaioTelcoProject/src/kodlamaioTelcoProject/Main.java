package kodlamaioTelcoProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kodlamaioTelcoProject.entities.concretes.Address;
import kodlamaioTelcoProject.entities.concretes.AddressType;
import kodlamaioTelcoProject.entities.concretes.AdslProduct;
import kodlamaioTelcoProject.entities.concretes.Canal;
import kodlamaioTelcoProject.entities.concretes.CorporateCustomer;
import kodlamaioTelcoProject.entities.concretes.IndividualCustomer;
import kodlamaioTelcoProject.entities.concretes.Invoice;
import kodlamaioTelcoProject.entities.concretes.Payment;
import kodlamaioTelcoProject.entities.concretes.Product;
import kodlamaioTelcoProject.entities.concretes.Subscription;
import kodlamaioTelcoProject.entities.concretes.SubscriptionPackage;
import kodlamaioTelcoProject.entities.concretes.Service;
import kodlamaioTelcoProject.entities.concretes.Package;

public class Main {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		List<Address> addresses = new ArrayList<Address>();
		List<Payment> payments = new ArrayList<Payment>();
		List<Invoice> invoices = new ArrayList<Invoice>();
		List<SubscriptionPackage> subscriptionPackages = new ArrayList<SubscriptionPackage>();
		
		
		AddressType addressType1 = new AddressType(1,"İş",addresses);
		AddressType addressType2 = new AddressType(2,"Ev",addresses);
		
		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1,"121212","Abc","1212131313",
				subscriptions,addresses);
		
		IndividualCustomer individualCustomer1 = new IndividualCustomer(2,"789456","İbrahim","Kaplan",
				"5468948",subscriptions,addresses);
	
		
		Address address1 = new Address(1,"İzmir",addressType1,corporateCustomer1);
		Address address2 = new Address(2,"İzmir",addressType2,individualCustomer1);
		
		Service service1 = new Service(1,"Fiber",subscriptions,products);
		
		AdslProduct adslProduct1 = new AdslProduct(1,"Asus","12121","cat-5",10,service1,5,100);
		
		Subscription subscription1 = new Subscription(1,corporateCustomer1,LocalDate.parse("2022-07-01"),
				service1,invoices,subscriptionPackages);
		
		Package package1 = new Package(1,"Paket",100,LocalDate.parse("2022-07-01"),
				LocalDate.parse("2022-07-30"),subscriptionPackages);
		
		SubscriptionPackage subscriptionPackage1 = new SubscriptionPackage(21,subscription1,package1);
		
		Canal canal1 = new Canal(1,"Banka-otamatik odeme",payments);
		
		Payment payment1 = new Payment();
		payment1.setId(1);
		payment1.setCanal(canal1);
		payment1.setDate(LocalDate.parse("2022-07-24"));
		
		Invoice invoice1 = new Invoice(1,subscription1,LocalDate.parse("2022-07-30"),
				LocalDate.parse("2022-08-11"),payment1);
		payment1.setInvoice(invoice1);
		
		products.add(adslProduct1);
		subscriptions.add(subscription1);
		addresses.add(address1);
		addresses.add(address2);
		payments.add(payment1);
		invoices.add(invoice1);
		subscriptionPackages.add(subscriptionPackage1);
		
		System.out.println(invoice1.getPayment().getCanal().getName());
		System.out.println(individualCustomer1.getSubscriptions().get(0).getCustomer().getCustomerNumber());

	}

}
