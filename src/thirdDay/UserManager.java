package thirdDay;

public class UserManager{
	
	public void add(User user) {
		System.out.println(user.getFirstname() + " " + user.getLastname() + " eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstname() + " " + user.getLastname() + " guncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstname() + " " + user.getLastname() + " silindi.");
	}
	
	
}
