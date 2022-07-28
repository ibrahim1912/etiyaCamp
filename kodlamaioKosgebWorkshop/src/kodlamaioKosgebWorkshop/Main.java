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

public class Main {

	public static void main(String[] args) {

		List<AuthorityOfUser> authorityOfUsers = new ArrayList<AuthorityOfUser>();
		List<Application> applications = new ArrayList<Application>();
		List<CustomerOfBank> customerOfBanks = new ArrayList<CustomerOfBank>();
		List<BankPersonnel> bankPersonnels = new ArrayList<BankPersonnel>();
		List<KosgebPersonnel> kosgebPersonnels = new ArrayList<KosgebPersonnel>();
		List<CreditAttribute> creditAttributes = new ArrayList<CreditAttribute>();
		List<Entrepreneur> bannedLists = new ArrayList<Entrepreneur>();

		CorporateCustomer corporateCustomer1 = new CorporateCustomer(2, "corporate@info.com", "123456",
				authorityOfUsers, "11111", applications, "11111", "ABC");
		Entrepreneur entrepreneur1 = new Entrepreneur(3, "berkan@gmail.com", "123456", authorityOfUsers, "22222",
				applications, "Berkan", "Aslan", "2222222");
		Entrepreneur entrepreneur2 = new Entrepreneur(10, "adsakj@hotmail.com", "asndsnakja", authorityOfUsers,
				"1000000", applications, "adsadadsd", "adsadssa", "000000");
		Bank bank1 = new Bank(1, "Ziraat Bankası", customerOfBanks);
		BankPersonnelTittle bankPersonnelTittle = new BankPersonnelTittle(1, "Financial Manager", bankPersonnels);
		KosgebPersonnelTittle kosgebPersonnelTittle = new KosgebPersonnelTittle(1, "KOSGEB Çalışan", kosgebPersonnels);
		ApplicationType applicationType = new ApplicationType(1, "KOBİ", applications);
		AuthorityOfUser authorityOfUser = new AuthorityOfUser();
		authorityOfUser.setId(1);
		authorityOfUser.setUser(entrepreneur1);
		Authority authority = new Authority(1, "Görüntülemek", authorityOfUser);
		authorityOfUser.setAuthority(authority);

		AuthorityOfUser authorityOfUser2 = new AuthorityOfUser();
		authorityOfUser2.setId(2);
		authorityOfUser2.setUser(entrepreneur2);
		Authority authority2 = new Authority(2, "Onaylamak", authorityOfUser2);
		authorityOfUser2.setAuthority(authority2);

		CreditVariety creditVariety = new CreditVariety(1, "Destek kredisi");
		Credit credit = new Credit();
		credit.setId(1);

		CreditType creditType = new CreditType(1, LocalDate.parse("2022-07-28"), LocalDate.parse("2023-07-28"),
				creditVariety, credit);
		credit.setCreditType(creditType);
		credit.setCreditAttributes(creditAttributes);

		
		Attribute attribute1 = new Attribute(1, "Destek Oranı", "100");
		Attribute attribute2 = new Attribute(2, "Üst Limit", "5000");
		Attribute attribute3 = new Attribute(3, "Alt Limit", "4000");
		Attribute attribute4 = new Attribute(4, "İl", "Erzurum");

		
		CreditAttribute creditAttribute1 = new CreditAttribute(1, credit, attribute1);
		CreditAttribute creditAttribute2 = new CreditAttribute(1, credit, attribute2);
		CreditAttribute creditAttribute3 = new CreditAttribute(1, credit, attribute3);
		CreditAttribute creditAttribute4 = new CreditAttribute(1, credit, attribute4);
		
		
		
		Application application1 = new Application(1, applicationType, entrepreneur1, credit);
		CustomerOfBank customerOfBank1 = new CustomerOfBank(4, "eda@gmail.com", "12356", authorityOfUsers, "123456",
				applications, "Eda Kevser", "Demir", bank1);
		BankPersonnel bankPersonnel = new BankPersonnel(8, "iibrahim@gmail.com", "123456", authorityOfUsers, "İbrahim",
				"Kaplan", bankPersonnelTittle);
		KosgebPersonnel kosgebPersonnel = new KosgebPersonnel(5, "atakan@gmail.com", "1246", authorityOfUsers, "Atakan",
				"Keçeci", kosgebPersonnelTittle);

		Application application2 = new Application(2, applicationType, entrepreneur2, credit);

		authorityOfUsers.add(authorityOfUser);
		applications.add(application1);
		applications.add(application2);
		customerOfBanks.add(customerOfBank1);
		bankPersonnels.add(bankPersonnel);
		kosgebPersonnels.add(kosgebPersonnel);
		creditAttributes.add(creditAttribute1);
		creditAttributes.add(creditAttribute2);
		creditAttributes.add(creditAttribute3);
		creditAttributes.add(creditAttribute4);
		
		authorityOfUsers.add(authorityOfUser2);
		bannedLists.add(entrepreneur2);

//		System.out.println(
//				entrepreneur1.getApplications().get(0).getCredit().getCreditType().getCreditVariety().getCreditName());
//		System.out.println(authorityOfUsers.get(0).getUser().getEmail());
//		System.out.println(authorityOfUsers.get(1).getAuthority().getAuthorityType());
		
		System.out.println("Basvuru : " + application1.getId());
		System.out.println("\t Basvuru Sahibi'nin epostasi ismi: " + application1.getCustomer().getEmail());
		System.out.println("\t Basvurulan kredi ismi: " + application1.getCredit().getCreditType().getCreditVariety().getCreditName());
		System.out.println("\t Basvurulan kredinin ozellikleri:");
		for(CreditAttribute creditAttribute : application1.getCredit().getCreditAttributes()) {
			System.out.println("\t\t"+creditAttribute.getAttribute().getName()+" : "+ creditAttribute.getAttribute().getValue());
		}
		
		//System.out.println(bannedLists.get(0).getFirstName());

	}

}
