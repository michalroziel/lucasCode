import java.util.*;

public class Main{

	public static void main(String[] args){ 
		
		Scanner inputScanner = new Scanner(System.in);

		chooseTask(inputScanner, args);

		inputScanner.close();
        }

	public static void printlnLowerSpace(String message){

		System.out.println(message);

		System.out.println();
	}	


	public static void printlnMenue(){

		System.out.println("Welcome to the second worksheet!");

                System.out.println();

                System.out.println("If you want to quit press 0 and enter");

                System.out.println();

                System.out.println("Please select the Task (1 to 4) you want to navigate to:");
	}


	public static void printlnWithBar(String message){

		System.out.println();

                System.out.println(message);

                System.out.println();

                System.out.println("|----------------------------------------------------------------|");

                System.out.println();
	}


	public static void println(String message){

		System.out.println();

		System.out.println(message);

		System.out.println();
	}

	/*
         *validScannerInputInt
         *
         *Because we parse a String into an Integer with parseInt we need to check if
         *the input-String only consist of an "int i". With the try-statement we can catch
         *Exceptions that would be thrown if parseInt would fail.
         *
         *@param inputScanner   this is the String that will be checked
         *@return testValue     this is the Value of the String input after validation
         */

        public static int validScannerInputInt(String inputScanner){

                System.out.println();

                int testValue = 0;

                try{
                        if (inputScanner.isEmpty()){

                                System.out.println();

                                System.out.println("Input error: Please check your input again!");

                                return -1;
                        }else{

                                testValue = Integer.parseInt(inputScanner);

				if (testValue < 0){

					return -1;
				}else{

                                	return testValue;
				}
                        }
                }

                catch (Exception e){

                        System.out.println();

                        System.out.println("Input error: Please check your input again!");

                        return -1;
                }
        }


	public static void chooseTask(Scanner inputScanner, String[] args){

		printlnMenue();

		int taskNumber = validScannerInputInt(inputScanner.nextLine());


		switch(taskNumber){

			case 0:
				printlnWithBar("End of worksheet 2");
				break;

			case 1:
				TaskOneControlFlowTestDrive testDriveControlFlow = new TaskOneControlFlowTestDrive(inputScanner);

                		testDriveControlFlow.testDriveMenue(args);
				break;

			case 2:
				printlnWithBar("Please look at the source code under TaskTwoPerson.java and TaskTwoStudent.java");

				main(args);
				break;

			case 3:
				TaskThreePersonTestDrive testDrivePerson = new TaskThreePersonTestDrive(inputScanner);

				testDrivePerson.testDriveMenue(args);
				break;

			case 4:
				CatTestDrive testDriveCat = new CatTestDrive(inputScanner);

				testDriveCat.printlnMenue();

				testDriveCat.chooseNumberOfCats(args);
				break;

			default:
				printlnWithBar("Input error: The Task you are trying to reach is out of bounds :(");

				main(args);
		}
	}
}
