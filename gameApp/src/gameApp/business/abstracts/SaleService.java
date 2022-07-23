package gameApp.business.abstracts;

import java.util.List;

import gameApp.entities.concretes.Sale;

public interface SaleService {

	void sale(Sale sale);
	
	List<Sale> getAll();
	
}
