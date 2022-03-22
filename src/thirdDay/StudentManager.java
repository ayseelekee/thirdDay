package thirdDay;


public class StudentManager extends UserManager{
	
	 @Override
	public void add(Student student) {
			System.out.println(student.getFirstname() + " " + student.getLastname() + " eklendi.");

	}
	 
	 @Override
	public void update(Student student) {
		 System.out.println(student.getFirstname() + " " + student.getLastname() + " guncellendi.");
	}
	 
	 @Override
	public void delete(Student student) {
		 System.out.println(student.getFirstname() + " " + student.getLastname() + " silindi.");
	}
	 

}
