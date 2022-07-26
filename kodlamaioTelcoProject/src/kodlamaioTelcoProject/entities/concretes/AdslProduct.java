package kodlamaioTelcoProject.entities.concretes;

public class AdslProduct extends Product {
	
	private int bandwidth;
	private int speedCapability;
	
	public AdslProduct() {
		
	}

	public AdslProduct(int id, String brand, String serialNumber, String cableType, 
			int cableLength, Service service,int bandwidth, int speedCapability) {
		super(id,brand,serialNumber,cableType,cableLength,service);
		this.bandwidth = bandwidth;
		this.speedCapability = speedCapability;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	public int getSpeedCapability() {
		return speedCapability;
	}

	public void setSpeedCapability(int speedCapability) {
		this.speedCapability = speedCapability;
	}

}
