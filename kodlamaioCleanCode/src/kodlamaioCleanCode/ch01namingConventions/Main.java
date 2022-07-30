package kodlamaioCleanCode.ch01namingConventions; //paket ismimleri camelCase

import java.util.List; //import isimleri camelCase

public class Main { 

	public static void main(String[] args) {

	}

}

class ProductManager { // class isimleri PascalCase
	
	private int maxNumber; // değişken isimleri camelCase
	
	public final String SECURITY_TOKEN = "..."; //final keyword ile değişken ismleri SCREAMING_SNAKE_CASE
	
	public ProductManager() { //constructor ismi PascalCase
		
	}
	
	
	public void getByCategoryId(int categoryId) { //metot isimleri camelCase
		List<Integer> numbers;
	}
}

 interface ProductRepository{ //interface isimleri PascalCase

}
