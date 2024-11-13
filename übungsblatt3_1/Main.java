import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner inputScanner = new Scanner(System.in);

		Task task1 = new Task("", "", inputScanner, args);

		task1.setTaskNumber("1");

		task1.setNumberOfSubTasks("2");

		System.out.println(task1.getTaskNumber());

		System.out.println(task1.getNumberOfSubTasks());
	}
}
