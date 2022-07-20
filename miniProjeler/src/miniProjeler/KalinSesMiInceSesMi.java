package miniProjeler;

public class KalinSesMiInceSesMi {

	public static void main(String[] args) {
		
		char harf='I';
		
		switch (harf) {
		case 'A','E','I','İ':
			System.out.println("Ince sesli harftir");
			break;
		case 'O','Ö','U','Ü':
			System.out.println("Kalın sesli harftir");
			break;
		default:
			System.out.println("Lütfen sesli harf giriniz.");
			break;
		}
	}
}
