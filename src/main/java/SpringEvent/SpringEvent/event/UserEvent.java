package SpringEvent.SpringEvent.event;

import org.springframework.context.ApplicationEvent;

import SpringEvent.SpringEvent.model.User;

public class UserEvent extends ApplicationEvent {
	
	private User user;
	private final boolean admin;
	
	public UserEvent(Object obj ,User user){
		super(obj);
		this.user=user;
		this.admin= user.isAdmin();
		
	}
	public User getUser(){
		return user;
	}
	public boolean isAdmin() {
		return admin;
	}
	

}
