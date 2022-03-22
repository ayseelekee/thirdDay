package thirdDay;

public class Instructor {
	private int instructornumber;

	public Instructor() {
	}

	public Instructor(int id, String firstname, String lastname, String username, int password, int instructornumber) {
		this.instructornumber = instructornumber;
	}

	public int getInstructornumber() {
		return instructornumber;
	}

	public void setInstructornumber(int instructornumber) {
		this.instructornumber = instructornumber;
	}
	
	
}
