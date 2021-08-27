package de.gagan.jpa.learnjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.gagan.jpa.learnjpa.entity.User;
import de.gagan.jpa.learnjpa.service.UserDao;
import de.gagan.jpa.learnjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class); 
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Priya", "Admin");
		userRepo.save(user);
		logger.info("User saved with id : " + user);
		Optional<User> userWithId2 = userRepo.findById(2L);
		logger.info("User retrieved with id 2 : " + userWithId2);
		List<User> allUsers = userRepo.findAll();
		logger.info("All Users : " + allUsers);
	}
}
