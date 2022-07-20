package miniProjeler;

import java.util.Random;

public class SayiBulma {

	public static void main(String[] args) {

		int aranacak = 5;
		
		Random random = new Random();
		int[] sayilar = new int[20];
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = random.nextInt(0, 20);
		}

		for (int sayi : sayilar) {
			System.out.println(sayi); 
		}
		

		for (int sayi : sayilar) {
			if (sayilar[sayi] == aranacak) {	
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println(aranacak + ": Sayi mevcuttur");
		} else {
			System.out.println(aranacak + ": Sayi mevcut degildir.");
		}
	}
}
