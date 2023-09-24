package LogPrct.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import LogPrct.Entity.User;
import LogPrct.Repository.UserRepository;
import jakarta.servlet.http.HttpSession;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public User saveUser(User user) {
	User newUser=userRepo.save(user);
		
		return newUser;
	}

	@Override
	public void removeMessage() {
		HttpSession session=((ServletRequestAttributes)(RequestContextHolder
				.getRequestAttributes())).getRequest().getSession();
		session.removeAttribute("msg");
		
		
	}

}
