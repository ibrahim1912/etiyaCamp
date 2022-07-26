package kodlamaioTelcoProject.entities.concretes;

public class SubscriptionPackage {

	private int id;
	private Subscription subscription;
	private Package packet;
	
	public SubscriptionPackage() {
		
	}

	public SubscriptionPackage(int id, Subscription subscription, Package packet) {
		this.id = id;
		this.subscription = subscription;
		this.packet = packet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Package getPacket() {
		return packet;
	}

	public void setPacket(Package packet) {
		this.packet = packet;
	}
	
	
}
