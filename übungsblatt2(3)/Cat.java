import java.util.*;

public class Cat{

	private String name;
	private int age;
	private String coatColor;

	Cat (String name, int age, String coatColor){

		this.name = name;
		this.age = age;
		this.coatColor = coatColor;
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

	public String getCoatColor(){

		return this.coatColor;
	}

	public void setCoatColor(String newCoatColor){
		
		this.coatColor = newCoatColor;
	}

	public static void meow(){

		System.out.println("meow");
	}
}
