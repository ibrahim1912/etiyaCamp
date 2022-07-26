package kodlamaioTelcoProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Package {

	private int id;
	private String name;
	private double price;
	private LocalDate dateStarted;
	private LocalDate  dueDate;
	
	private List<SubscriptionPackage> subscriptionPackages;
	
	public Package() {
		
	}

	public Package(int id, String name, double price, LocalDate dateStarted, LocalDate dueDate,
			List<SubscriptionPackage> subscriptionPackages) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.dateStarted = dateStarted;
		this.dueDate = dueDate;
		this.subscriptionPackages=subscriptionPackages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public List<SubscriptionPackage> getSubscriptionPackages() {
		return subscriptionPackages;
	}

	public void setSubscriptionPackages(List<SubscriptionPackage> subscriptionPackages) {
		this.subscriptionPackages = subscriptionPackages;
	}

	
}
