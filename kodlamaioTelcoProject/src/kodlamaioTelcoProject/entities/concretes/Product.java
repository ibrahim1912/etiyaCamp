package kodlamaioTelcoProject.entities.concretes;

public class Product {

	private int id;
	private String brand;
	private String serialNumber;
	private String cableType;
	private int cableLength;
	
	private Service service;
	
	public Product() {
		
	}

	public Product(int id, String brand, String serialNumber, String cableType, 
			int cableLength, Service service) {
		this.id = id;
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.cableType = cableType;
		this.cableLength = cableLength;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCableType() {
		return cableType;
	}

	public void setCableType(String cableType) {
		this.cableType = cableType;
	}

	public int getCableLength() {
		return cableLength;
	}

	public void setCableLength(int cableLength) {
		this.cableLength = cableLength;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
}
