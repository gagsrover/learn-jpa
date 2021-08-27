package de.gagan.jpa.learnjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.gagan.jpa.learnjpa.entity.User;
import de.gagan.jpa.learnjpa.service.UserDao;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class); 
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Gagan", "Admin");
		long userId = userDao.insert(user);
		logger.info("User saved with id : " + user);
	}
}
