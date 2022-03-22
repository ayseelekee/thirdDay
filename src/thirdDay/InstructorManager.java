package thirdDay;


public class IntructorManager extends UserManager{
	
 	@Override
	public void add(Instructor instructor) {
			System.out.println(instructor.getFirstname() + " " + instructor.getLastname() + " eklendi.");

	}
	 
	 @Override
	public void update(Instructor instructor) {
		 System.out.println(instructor.getFirstname() + " " + instructor.getLastname() + " guncellendi.");
	}
	 
	 @Override
	public void delete(Instructor instructor) {
		 System.out.println(instructor.getFirstname() + " " + instructor.getLastname() + " silindi.");
	}
}
