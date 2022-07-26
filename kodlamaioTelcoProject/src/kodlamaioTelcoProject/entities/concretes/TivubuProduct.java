package kodlamaioTelcoProject.entities.concretes;

public class TivubuProduct extends Product {

	private int usbPortNumber;
	
	public TivubuProduct() {
		
	}

	public TivubuProduct(int id, String brand, String serialNumber, String cableType, 
			int cableLength, Service service,int usbPortNumber) {
		super(id,brand,serialNumber,cableType,cableLength,service);
		this.usbPortNumber = usbPortNumber;
	}

	public int getUsbPortNumber() {
		return usbPortNumber;
	}

	public void setUsbPortNumber(int usbPortNumber) {
		this.usbPortNumber = usbPortNumber;
	}
}
