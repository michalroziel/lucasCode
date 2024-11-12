import java.util.*;

public class TaskOneControlFlowTestDrive{

        private	static Scanner inputScanner;

	TaskOneControlFlowTestDrive(Scanner inputScanner){
		this.inputScanner = inputScanner;
	}
	
	public void testDriveMenue(String[] args){

		printlnMenue();

                int partOfTask = Main.validScannerInputInt(this.inputScanner.nextLine());

                choosePartOfTask(partOfTask, args);
	}


	public static void printlnMenue(){

		System.out.println("|----------------------------------------------------------------|");

		System.out.println();

		System.out.println("Welcome to task 1 out of 4!");

                System.out.println();

                System.out.println("If you want to quit press 0 and enter");

                System.out.println();

        	System.out.println("Please select the part (1 to 3) of task 1 you'd like to test:");

	}


	/*
	 *choosePartOfTask
	 *
	 *Because Task 1 consists of three parts, this method should help the user navigating through the whole Task.
	 *Depending on which part the user wants to navigate to, this method uses the switch-statement in order to
	 *go to each of the parts. To signal the user that one part or the whole task has been completed, it prints  
	 *a "End of (...)" message before returning back to the main-Method/ending the program. Returning to the 
	 *main-method is just for the convenience of the user, meaning he or she doesn't have to re-run the whole program
	 *after each parts completion.
	 *
	 *@param partOfTask	the part the user wants to navigate to
	 *@param args		so the program can go back to the main-method, we need to give it its parameters
	 */

	public void choosePartOfTask(int partOfTask, String[] args){

		String userName = "";

		if (partOfTask != 0 &&  partOfTask != -1) userName = getNameFromUser();

		switch (partOfTask){

                        case 0:
				Main.printlnWithBar("End of Task 1");

				Main.chooseTask(this.inputScanner, args);
                                break;

                        case 1:
                                aufgabe1_1_simpleGreeting(userName);
				
				Main.println("End of Task 1.1");

				testDriveMenue(args);
                                break;

                        case 2:
                                aufgabe1_2_repeatedGreeting(userName, args);
				
				Main.println("End of Task 1.2");

				testDriveMenue(args);
                                break;
			
			case 3:
				aufgabe1_3_checkForName(userName, args);
				
				Main.println("End of Task 1.3");

				testDriveMenue(args);
				break;

                        default:
				Main.println("Input Error: Part of Task out of bounds :(");

				testDriveMenue(args);
                }
	}

	
	/*
	 *getNameFromUser
	 *
	 *Asks the user to enter his or her name and returns it
	 */

	public String getNameFromUser(){

		System.out.println("Please enter your name:");

		String userName = this.inputScanner.nextLine();

		System.out.println();

		return userName;
	}


	/*
	 *aufgabe1_1_simpleGreeting
	 *
	 *Gets the name of the user and prints it into the console
	 *
	 *@param userName	the name of the user
	 *@return		returns username to be used by the other methods
	 */

	public static void aufgabe1_1_simpleGreeting(String userName){

		System.out.println("Hi " + userName + ", nice to meet you!");
	}


	/*
	 *aufgabe1_2_repeatedGreeting
	 * 
	 *At first it asks the user how many time it should greet and after validation of the 
	 *input, it lets the user decide wether he or she wants the program the greetings
	 *via a for- or while-loop.
	 *
	 * */


	public void aufgabe1_2_repeatedGreeting(String userName, String[] args){

		int quantityOfGreetings = 0;

		System.out.println("How many times do want to be greeted or greet someone?");

		quantityOfGreetings = Main.validScannerInputInt(this.inputScanner.nextLine());

		if (quantityOfGreetings == -1) testDriveMenue(args);	

		chooseLoopVariant(userName, quantityOfGreetings, args);
	}

	public void chooseLoopVariant(String userName, int quantityOfGreetings, String[] args){

		System.out.println("Please choose your loop-Variant by entering either for (to use a for-loop) or while (to use a while-loop)");

                String loopVariant = this.inputScanner.nextLine();

                System.out.println();

                switch(loopVariant){

                        case "for":
                                for (int i = 0; i < quantityOfGreetings; i++){

                                        System.out.println((i+1) + ") "+ "Hi " + userName + ", nice to meet you! This Message is brought to you via a for-loop :)");
                                }
                                break;

                        case "while":
                                while (quantityOfGreetings > 0){

                                                System.out.println(quantityOfGreetings + ") "+ "Hi " + userName + ", nice to meet you! This Message is brought to you via a while-loop :)");
                                                quantityOfGreetings--;
                                }
                                break;

                        default:
                                Main.printlnWithBar("Please only decide between for- and while-loop");

				chooseLoopVariant(userName, quantityOfGreetings, args);
                }

	}


	public void aufgabe1_3_checkForName(String userName, String[] args){
		
		if (userName.isEmpty()){

			System.out.println("Input error: No name could be detected");

			return;
		}else{

			aufgabe1_2_repeatedGreeting(userName, args);
		}
	}
}
