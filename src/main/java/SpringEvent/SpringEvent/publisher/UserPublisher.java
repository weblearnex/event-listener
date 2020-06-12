package SpringEvent.SpringEvent.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import SpringEvent.SpringEvent.event.UserEvent;
import SpringEvent.SpringEvent.model.User;

@Service
public class UserPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public String userPublisher(User user){
		UserEvent userEvent = new UserEvent(this,user);
		applicationEventPublisher.publishEvent(userEvent);
		return "Event Publisher";
		
	}

}
