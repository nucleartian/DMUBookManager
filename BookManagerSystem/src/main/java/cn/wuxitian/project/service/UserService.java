package cn.wuxitian.project.service;

import cn.wuxitian.project.model.User;
import cn.wuxitian.project.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;



	public User getUser(String email) {
		return userDAO.selectByEmail(email);
	}
	
	public int addUser(User user){
    	return userDAO.addUser(user);
	}
	
	
}
