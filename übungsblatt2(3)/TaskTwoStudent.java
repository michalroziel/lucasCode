import java.util.*;

public class TaskTwoStudent extends TaskTwoPerson{

	private String studyCourse;
	private int studentID;

	TaskTwoStudent(String name, int age, String studyCourse, int studentID){

		super(name, age);

		this.studyCourse = studyCourse;
		this.studentID = studentID;
	}


	public String getCourse(){

		return this.studyCourse;
	}

	public void setCourse(String newCourse){

		this.studyCourse = newCourse;
	}

	public int getStudentID(){

		return this.studentID;
	}

	public void setStudentID(newID){

		this.studentID = newID;
	}
}
