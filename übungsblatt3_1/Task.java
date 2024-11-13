import java.util.*;

public class Task{

	private Scanner inputScanner;
	private String taskNumber;
	private String numberOfSubTasks;
	private String[] args;

	Task(String taskNumber, String numberOfSubTasks, Scanner inputScanner, String[] args){
		
		this.taskNumber = taskNumber;
		this.numberOfSubTasks = numberOfSubTasks;
		this.inputScanner = inputScanner;
		this.args = args;
	}

	public String getTaskNumber(){

		return this.taskNumber;
	}

	public void setTaskNumber(String newTaskNumber){

		this.taskNumber = newTaskNumber;		
	}

	public String getNumberOfSubTasks(){

		return this.numberOfSubTasks;
	}

	public void setNumberOfSubTasks(String newNumberOfSubTasks){

		this.numberOfSubTasks = newNumberOfSubTasks;
	}
}
