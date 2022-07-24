package eTrade.core.adapter;

import eTrade.business.abstracts.VerificationEmailService;
import eTrade.entities.concretes.User;
import verificationEmail.VerificationEmailManager;

public class VerificationEmailAdapter implements VerificationEmailService {

	VerificationEmailManager verificationEmailManager = new VerificationEmailManager();

	@Override
	public boolean verificationEmail(User user) {
		verificationEmailManager.verificationEmail(user.getEmail());
		return true;
	}
}
