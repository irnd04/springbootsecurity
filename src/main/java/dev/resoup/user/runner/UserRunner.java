package dev.resoup.user.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import dev.resoup.user.service.UserService;
import lombok.val;

@Component
public class UserRunner implements ApplicationRunner {
	
	private Logger logger = LoggerFactory.getLogger(UserRunner.class);

	@Autowired
	private UserService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		val user = userService.createUser("user", "user");
		logger.info(user.toString());
	}
}
