package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class Credit {

	private int id;
	private CreditType creditType;
	
	private List<CreditAttribute> creditAttributes;

	public Credit() {
	}

	public Credit(int id, CreditType creditType,List<CreditAttribute> creditAttributes) {
		this.id = id;
		this.creditType = creditType;
		this.creditAttributes=creditAttributes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CreditType getCreditType() {
		return creditType;
	}

	public void setCreditType(CreditType creditType) {
		this.creditType = creditType;
	}

	public List<CreditAttribute> getCreditAttributes() {
		return creditAttributes;
	}

	public void setCreditAttributes(List<CreditAttribute> creditAttributes) {
		this.creditAttributes = creditAttributes;
	}
}
