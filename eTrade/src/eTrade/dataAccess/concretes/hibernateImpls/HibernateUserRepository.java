package eTrade.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.UserRepository;
import eTrade.entities.concretes.User;

public class HibernateUserRepository implements UserRepository {

	List<User> users;

	public HibernateUserRepository() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);

	}

	@Override
	public void update(User user) {
		User userToUpdate = getById(user.getId());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
	}

	@Override
	public void delete(User user) {
		users.remove(getById(user.getId()));

	}

	@Override
	public User getById(int id) {
		User findToUser = null;
		for (User user : users) {
			if (user.getId() == id) {
				findToUser = user;
			}
		}
		return findToUser;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
