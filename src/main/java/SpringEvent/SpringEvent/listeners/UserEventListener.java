package SpringEvent.SpringEvent.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import SpringEvent.SpringEvent.event.UserEvent;

@Component
public class UserEventListener{ //implements ApplicationListener<UserEvent> {
	
	
	
	@EventListener(condition="#root.args[0].admin")
	public void handleUserEvent(UserEvent event) {
		System.out.println("Listener getting :::"+event.getUser().getName());
		
	}

}
