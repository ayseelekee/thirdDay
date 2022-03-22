package thirdDay;


public class Student extends User{
	private int studentnumber;

	
	
	public Student() {
	}

	
	
	public Student(int id, String firstname, String lastname, String username, int password, int studentnumber) {
		this.studentnumber = studentnumber;
	}

	
	
	public int getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}
	
	
}
