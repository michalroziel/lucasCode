import java.util.*;

public class TaskThreePersonTestDrive{

	private Scanner inputScanner;

	TaskThreePersonTestDrive(Scanner inputScanner){

		this.inputScanner = inputScanner;
	}

	public void testDriveMenue(String[] args){

                printlnMenue();

                int partOfTask = Main.validScannerInputInt(this.inputScanner.nextLine());

                choosePartOfTask(partOfTask, args);
        }

	public String[] getNameAndAgeFromUser(){
		
		String[] userData = new String[2];

                System.out.println("Please enter the Persons name:");

                String userName = this.inputScanner.nextLine();

		userData[0] = userName;

                System.out.println();

		System.out.println("Please enter their age:");

		String userAge = this.inputScanner.nextLine();
		
		userData[1] = userAge;

                return userData;
        }



	public void choosePartOfTask(int partOfTask, String[] args){

                String[] userData = new String[2];

                switch (partOfTask){

                        case 0:
                                Main.printlnWithBar("End of Task 3");

                                Main.chooseTask(this.inputScanner, args);
                                break;

                        case 1:
				userData = getNameAndAgeFromUser();

                                initPerson(userData);

                                Main.println("End of Task 3.1.1");

                                testDriveMenue(args);
                                break;

                        case 2:
                                initGroupOfPeople(this.inputScanner);

                                Main.println("End of Task 3.1.2");

                                testDriveMenue(args);
                                break;

                        default:
                                Main.println("Input Error: Part of Task out of bounds :(");

                                testDriveMenue(args);
                }
        }



        public static void printlnMenue(){

                System.out.println("|----------------------------------------------------------------|");

                System.out.println();

                System.out.println("Welcome to task 3 out of 4!");

                System.out.println();

                System.out.println("If you want to quit press 0 and enter");

                System.out.println();

                System.out.println("Please enter 1 (to create one Person) or 2 (to create a group of people)");

        }
	

	public static void initPerson(String[] userData){

		String userName = userData[0];

		int userAge = Main.validScannerInputInt(userData[1]);

		TaskTwoPerson newPerson = new TaskTwoPerson(userName, userAge);

		newPerson.greet();
	}


	public static void initGroupOfPeople(Scanner inputScanner){

		List<TaskTwoPerson> groupOfPeople = new ArrayList<TaskTwoPerson>();

		Random randomAge = new Random();

		TaskTwoPerson me = new TaskTwoPerson("Lucas", 22);

		int age = 0;

		System.out.println();

		System.out.println("Please choose how many people the group should contain:");

		int numberOfPeople = Main.validScannerInputInt(inputScanner.nextLine());

		for (int i = 0; i < numberOfPeople; i++){
			
			age = randomAge.nextInt(100);

			me.setAge(age);

			groupOfPeople.add(me);

			me.greet();
		}
	}
}
