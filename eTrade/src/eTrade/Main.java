package eTrade;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.UserManager;
import eTrade.core.adapter.GoogleAccountAdapter;
import eTrade.core.adapter.VerificationEmailAdapter;
import eTrade.dataAccess.concretes.hibernateImpls.HibernateUserRepository;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true,
				StandardCharsets.UTF_8));

		User user1 = new User(1, "İbrahim", "Kaplan", "ibo@hotmail.comm", "rrrrrr");
		User user2 = new User(2, "İbo", "Kaplan", "kaplan@hotmail.comm", "r6g5gg");
		User user3 = new User(1, "İbrahim", "Kaplan", "ibo@hotmail.comm", "EEr6g5gg");
		
		UserService userService = new UserManager(new HibernateUserRepository(),new VerificationEmailAdapter(),new GoogleAccountAdapter());
		userService.add(user1);
		userService.add(user2);
		//userService.update(user3);
		userService.login(user2);
		System.out.println("----------------------------------------------");
		
		
		
		for (User user : userService.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println("----------------------------------------------");
			
		}
		
		
	}
}
