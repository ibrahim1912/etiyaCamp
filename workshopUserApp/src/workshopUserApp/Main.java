package workshopUserApp;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true,
				StandardCharsets.UTF_8));
		
		User user1 = new User(1,"ibrahim","Kaplan","ibo@com","wew",new SmsLogService());
		User user2 = new User(2,"ibo","Kaplan","ibo@com","wew",new EmailLogService());
		
		UserManager userManager = new UserManager();
		userManager.register(user1);
		userManager.forgotPassword(user1);
		userManager.register(user2);
		userManager.forgotPassword(user2);
	

	}

}
