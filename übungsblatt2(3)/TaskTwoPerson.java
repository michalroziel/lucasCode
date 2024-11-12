import java.util.*;

public class TaskTwoPerson{

	private String name;
	private int age;

	TaskTwoPerson(String name, int age){

		this.name = name;
		this.age = age;
	}


	public String getName(){

		return this.name;
	}

	public void setName(String newName){

		this.name = newName;
	}

	public int getAge(){

		return this.age;
	}

	public void setAge(int newAge){

		this.age = newAge;
	}


	public void greet(){

		System.out.println("Hi " + this.name +  ", nice to meet you! Your are currently " + this.age + " years old");
	}
}
