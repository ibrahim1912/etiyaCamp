package eTrade.business.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserService {

	void add(User user) throws Exception;
	void login(User user) throws Exception;
	void delete(User user);
	void update(User user) throws Exception;
	User getById(int id);
	List<User> getAll();
}
