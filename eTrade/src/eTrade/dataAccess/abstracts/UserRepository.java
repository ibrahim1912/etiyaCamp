package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserRepository {

	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getAll();
}
