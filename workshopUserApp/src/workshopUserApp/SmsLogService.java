package workshopUserApp;

public class SmsLogService implements LogService {

	@Override
	public void registerLog(User user) {
		System.out.println("Sms ile kayit olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		System.out.println("Sms ile şifre yenileme bağlantısı yollandi " + user.getFirstName());
		
	}

}
