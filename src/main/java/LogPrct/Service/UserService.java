package LogPrct.Service;

import org.springframework.stereotype.Service;

import LogPrct.Entity.User;
@Service
public interface UserService {
	public User saveUser(User user);
	public void removeMessage();

}
