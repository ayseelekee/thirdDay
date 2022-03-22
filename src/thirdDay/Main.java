package thirdDay;

public class Main {
	
	User user1 = new User(1,"ayse","leke","ayseleke",12345);
    Student user2= new Student(2,"cagan","leke","caganleke",12356,90);
    Instructor user3= new Instructor(3,"engin","demirog","engindemirog",12367,80);

    UserManager userManager= new UserManager();
    StudentManager studentManager= new StudentManager();
    IntructorManager instructorManager= new IntructorManager();
    
    userManager.add(user1);
    
}
