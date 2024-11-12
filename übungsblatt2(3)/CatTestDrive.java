import java.util.*;

public class CatTestDrive{

	private Scanner inputScanner;

	CatTestDrive(Scanner inputScanner){

		this.inputScanner = inputScanner;
	}

	public static void printlnMenue(){

                System.out.println("|----------------------------------------------------------------|");

                System.out.println();

                System.out.println("Welcome to task 4 out of 4!");

                System.out.println();

                System.out.println("If you want to quit press 0 and enter");
        }

	public void chooseNumberOfCats(String[] args){

		List<Cat> cats = new ArrayList<Cat>();

		Cat cat = new Cat("", 0, "white");

		Main.printlnLowerSpace("How many Cats do you like to create?");

		int numberOfCats = Main.validScannerInputInt(this.inputScanner.nextLine());

		for (int i = 0; i < numberOfCats; i++){

			Main.printlnLowerSpace(i + ") What is the name of this cat?");

			cat.setName(this.inputScanner.nextLine());

			Main.printlnLowerSpace("How old is this cat?");

			cat.setAge(Main.validScannerInputInt(this.inputScanner.nextLine()));

			Main.println("What color is its coat?");

			cat.setCoatColor(this.inputScanner.nextLine());

			cats.add(cat);
		}

		System.out.println(cats);

		Main.main(args);
	}	
}
