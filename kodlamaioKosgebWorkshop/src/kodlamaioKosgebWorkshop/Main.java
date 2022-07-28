package kodlamaioKosgebWorkshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kodlamaioKosgebWorkshop.entities.concretes.Application;
import kodlamaioKosgebWorkshop.entities.concretes.ApplicationType;
import kodlamaioKosgebWorkshop.entities.concretes.Attribute;
import kodlamaioKosgebWorkshop.entities.concretes.Authority;
import kodlamaioKosgebWorkshop.entities.concretes.AuthorityOfUser;
import kodlamaioKosgebWorkshop.entities.concretes.Bank;
import kodlamaioKosgebWorkshop.entities.concretes.BankPersonnel;
import kodlamaioKosgebWorkshop.entities.concretes.BankPersonnelTittle;
import kodlamaioKosgebWorkshop.entities.concretes.CorporateCustomer;
import kodlamaioKosgebWorkshop.entities.concretes.Credit;
import kodlamaioKosgebWorkshop.entities.concretes.CreditAttribute;
import kodlamaioKosgebWorkshop.entities.concretes.CreditType;
import kodlamaioKosgebWorkshop.entities.concretes.CreditVariety;
import kodlamaioKosgebWorkshop.entities.concretes.CustomerOfBank;
import kodlamaioKosgebWorkshop.entities.concretes.Entrepreneur;
import kodlamaioKosgebWorkshop.entities.concretes.KosgebPersonnel;
import kodlamaioKosgebWorkshop.entities.concretes.KosgebPersonnelTittle;
import kodlamaioKosgebWorkshop.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		List<AuthorityOfUser> authorityOfUsers = new ArrayList<AuthorityOfUser>();
		List<AuthorityOfUser> authorityOfUsers2 = new ArrayList<AuthorityOfUser>();
		List<Application> applications = new ArrayList<Application>();
		List<CustomerOfBank> customerOfBanks = new ArrayList<CustomerOfBank>();
		List<BankPersonnel> bankPersonnels = new ArrayList<BankPersonnel>();
		List<KosgebPersonnel> kosgebPersonnels = new ArrayList<KosgebPersonnel>();
		List<CreditAttribute> creditAttributes = new ArrayList<CreditAttribute>();
		List<CreditAttribute> creditAttributes2 = new ArrayList<CreditAttribute>();

		CorporateCustomer corporateCustomer1 = new CorporateCustomer(2, "corporate@info.com", "123456",
				authorityOfUsers, "11111", applications, "11111", "ABC");
		Entrepreneur entrepreneur1 = new Entrepreneur(3, "berkan@gmail.com", "123456", authorityOfUsers, "22222",
				applications, "Berkan", "Aslan", "2222222");
		Entrepreneur entrepreneur2 = new Entrepreneur(10, "adsakj@hotmail.com", "asndsnakja", authorityOfUsers,
				"1000000", applications, "adsadadsd", "adsadssa", "000000");
		
		BankPersonnelTittle bankPersonnelTittle = new BankPersonnelTittle(11, "Banka Şube Müdürü", bankPersonnels);
		KosgebPersonnelTittle kosgebPersonnelTittle = new KosgebPersonnelTittle(22, "Kosgeb Hizmet Merkezi Personeli", kosgebPersonnels);
		BankPersonnel bankPersonnel = new BankPersonnel(8, "iibrahim@gmail.com", "123456", authorityOfUsers, "İbrahim",
				"Kaplan", bankPersonnelTittle);
		KosgebPersonnel kosgebPersonnel = new KosgebPersonnel(5, "atakan@gmail.com", "1246", authorityOfUsers2, "Atakan",
				"Keçeci", kosgebPersonnelTittle);
		

		Authority authority1 = new Authority(1, "Krediyi goruntule");
		Authority authority2 = new Authority(2, "Krediyi onayla");
		
		AuthorityOfUser authorityOfUser1 = new AuthorityOfUser(1,authority1,bankPersonnel);
		AuthorityOfUser authorityOfUser2 = new AuthorityOfUser(2,authority2,bankPersonnel);
		AuthorityOfUser authorityOfUser3 = new AuthorityOfUser(3,authority1,kosgebPersonnel);

		CreditVariety creditVariety = new CreditVariety(1, "Destek kredisi");
		CreditVariety creditVariety2 = new CreditVariety(2, "Kobi kredisi");
		
		Credit credit1 = new Credit();
		credit1.setId(1);
		
		Credit credit2 = new Credit();
		credit2.setId(2);

		CreditType creditType1 = new CreditType(1, LocalDate.parse("2022-07-28"), LocalDate.parse("2023-07-28"),
				creditVariety, credit1);
		credit1.setCreditType(creditType1);
		credit1.setCreditAttributes(creditAttributes);

		CreditType creditType2 = new CreditType(2, LocalDate.parse("2022-06-28"), LocalDate.parse("2028-07-28"),
				creditVariety2, credit2);
		credit2.setCreditType(creditType2);
		credit2.setCreditAttributes(creditAttributes2);
		
		Attribute attribute1 = new Attribute(1, "Destek Orani", "100");
		Attribute attribute2 = new Attribute(2, "Ust Limit", "5000");
		Attribute attribute3 = new Attribute(3, "Alt Limit", "4000");
		Attribute attribute4 = new Attribute(4, "Il", "Erzurum");
		
		Attribute attribute5 = new Attribute(5,"Destek Orani","50");
		Attribute attribute6 = new Attribute(6,"Sektor","Tarim");

		
		CreditAttribute creditAttribute1 = new CreditAttribute(1, credit1, attribute1);
		CreditAttribute creditAttribute2 = new CreditAttribute(1, credit1, attribute2);
		CreditAttribute creditAttribute3 = new CreditAttribute(1, credit1, attribute3);
		CreditAttribute creditAttribute4 = new CreditAttribute(1, credit1, attribute4);
		
		CreditAttribute creditAttribute5 = new CreditAttribute(2, credit2, attribute5);
		CreditAttribute creditAttribute6 = new CreditAttribute(2, credit2, attribute6);
		
		ApplicationType applicationType1 = new ApplicationType(1, "Asil basvuru", applications);
		ApplicationType applicationType2 = new ApplicationType(2, "Yedek basvuru", applications);
		ApplicationType applicationType3 = new ApplicationType(3, "Onaylanmamis basvuru", applications);
		
		Application application1 = new Application(1, applicationType1, entrepreneur1, credit1);
		Application application2 = new Application(2, applicationType2, corporateCustomer1, credit2);
	
		Bank bank1 = new Bank(1, "Ziraat Bankası", customerOfBanks);
		CustomerOfBank customerOfBank1 = new CustomerOfBank(4, "eda@gmail.com", "12356", authorityOfUsers, "123456",
				applications, "Eda Kevser", "Demir", bank1);
		
		authorityOfUsers.add(authorityOfUser1);
		authorityOfUsers.add(authorityOfUser2);
		authorityOfUsers2.add(authorityOfUser3);
		applications.add(application1);
		applications.add(application2);
		customerOfBanks.add(customerOfBank1);
		bankPersonnels.add(bankPersonnel);
		kosgebPersonnels.add(kosgebPersonnel);
		creditAttributes.add(creditAttribute1);
		creditAttributes.add(creditAttribute2);
		creditAttributes.add(creditAttribute3);
		creditAttributes.add(creditAttribute4);
		creditAttributes2.add(creditAttribute5);
		creditAttributes2.add(creditAttribute6);
		


//		System.out.println(
//				entrepreneur1.getApplications().get(0).getCredit().getCreditType().getCreditVariety().getCreditName());
//		System.out.println(authorityOfUsers.get(0).getUser().getEmail());
//		System.out.println(authorityOfUsers.get(1).getAuthority().getAuthorityType());
		
		System.out.println("Basvuru : " + application1.getId());
		System.out.println("\t Basvuru Sahibi'nin epostasi : " + application1.getCustomer().getEmail());
		System.out.println("\t Basvurulan kredi ismi: " + application1.getCredit().getCreditType().getCreditVariety().getCreditName());
		System.out.println("\t Basvurulan kredinin ozellikleri:");
		for(CreditAttribute creditAttribute : application1.getCredit().getCreditAttributes()) {
			System.out.println("\t\t"+creditAttribute.getAttribute().getName()+" : "+ creditAttribute.getAttribute().getValue());
		}
		
		System.out.println("---------------------------------");
		System.out.println("Basvuru : " + application2.getId());
		System.out.println("\t Basvuru Sahibi'nin epostasi : " + application2.getCustomer().getEmail());
		System.out.println("\t Basvurulan kredi ismi: " + application2.getCredit().getCreditType().getCreditVariety().getCreditName());
		System.out.println("\t Basvurulan kredinin ozellikleri:");
		for(CreditAttribute creditAttribute : application2.getCredit().getCreditAttributes()) {
			System.out.println("\t\t"+creditAttribute.getAttribute().getName()+" : "+ creditAttribute.getAttribute().getValue());
		}
		
	
		System.out.println("---------------------------------");
		for (AuthorityOfUser authorityOfUser : kosgebPersonnel.getAuthorityOfUsers()) {
			System.out.println(authorityOfUser.getAuthority().getAuthorityType());
		} 
		
//		System.out.println(bankPersonnel.getAuthorityOfUsers().get(0).getAuthority().getAuthorityType());
//		System.out.println(bankPersonnel.getAuthorityOfUsers().get(1).getAuthority().getAuthorityType());
		
	}

}
