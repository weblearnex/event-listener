package SpringEvent.SpringEvent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import SpringEvent.SpringEvent.model.User;
import SpringEvent.SpringEvent.publisher.UserPublisher;

@RestController
public class UserController {
	@Autowired
	private UserPublisher userPublisher;
	
	@GetMapping("/")
	public String entry(){
		return "Application up and Running";
	}
	
	@GetMapping("/user/{name}/{type}")
	public User userPublisher(@PathVariable("name")String name,@PathVariable("type")boolean type){
		User user =new User();
		user.setName(name);
		user.setAdmin(type);
		user.setStatus("Active");
		userPublisher.userPublisher(user);
		return user;
		
	}
	

}
