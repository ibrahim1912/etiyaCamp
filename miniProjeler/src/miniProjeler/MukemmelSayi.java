package miniProjeler;

public class MukemmelSayi {

	public static void main(String[] args) {
		// 6 --> 1,2,3 e bölünür toplamı 6 eder
		// 28 --> 1,2,4,7,14 e bölünür toplamı 28 eder

		int toplam = 0;
		for (int i = 1; i < 10000; i++) {
			toplam = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					toplam = toplam + j;

				}
			}
			
			if (toplam == i) {
				System.out.println(i);
			}

		}

	}

}
