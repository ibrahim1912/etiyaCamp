package workshopUserApp;

import java.util.List;

public interface UserService {

	void register(User user);
	void forgotPassword(User user);
	List<User> getAll();
}
