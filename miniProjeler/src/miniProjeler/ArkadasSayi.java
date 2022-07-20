package miniProjeler;

public class ArkadasSayi {

	public static void main(String[] args) {
		// 220-284
		// 1 den başlayıp 220 ye kadar 220 dahil degil tüm bölenlerinin toplamı 284tür
		// aynı şekilde tersi içinde toplam 220 dir

		arkadasSayiMi(220, 284);

	}

	
	static boolean arkadasSayiMi(int sayi1, int sayi2) {
		int toplam1 = 0;
		int toplam2 = 0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 += i;
			}
		}
		if (toplam1 == sayi2 && toplam2 == sayi1) {
			System.out.println(sayi1 + " - " + sayi2 + ": arkadas sayidir.");
			return true;
		}
		System.out.println(sayi1 + " - " + sayi2 + ": arkadas sayi degildir");
		return false;
	}
}
