package kodlamaioTelcoProject.entities.concretes;

import java.util.List;

public class Service {

	private int id;
	private String name;
	
	private List<Subscription> subscriptions;
	private List<Product> products;
	
	public Service() {
		
	}

	public Service(int id, String name, List<Subscription> subscriptions,List<Product> products) {
		this.id = id;
		this.name = name;
		this.subscriptions = subscriptions;
		this.products = products;
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

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
