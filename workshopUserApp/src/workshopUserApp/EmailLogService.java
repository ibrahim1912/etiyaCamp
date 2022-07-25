package workshopUserApp;

public class EmailLogService implements LogService{


	@Override
	public void registerLog(User user) {
		System.out.println("Email ile kayit olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		System.out.println("Email ile şifre yenileme bağlantısı yollandi " + user.getFirstName());
	}

	

}
